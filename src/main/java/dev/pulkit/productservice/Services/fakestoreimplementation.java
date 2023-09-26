package dev.pulkit.productservice.Services;

import dev.pulkit.productservice.Models.Category;
import dev.pulkit.productservice.Models.product;
import dev.pulkit.productservice.dtos.productdtos;
import lombok.Builder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@Builder
public class fakestoreimplementation implements productservice {
    private RestTemplateBuilder restTemplateBuilder;

    public fakestoreimplementation(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;

    }

    @Override
    public List<product> getallproducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();


        return null;
    }

    @Override
    public product getsingleproduct(Long productid) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<productdtos> response = restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", productdtos.class, productid);
        productdtos productdto = response.getBody();
        product prod = new product();
        prod.setId(productdto.getId());
        prod.setTitle(productdto.getTitle());

        prod.setImageurl(productdto.getImage());
        prod.setPrice(productdto.getPrice());
        Category category = new Category();
        category.setname(productdto.getCategory());
        prod.setCategory(category);


        return prod;
    }

    @Override
    public boolean deleteproduct(Long productid) {
        return false;
    }

    @Override
    public product addnewproduct(product product) {
        return null;
    }

//    @Override
//    public product addnewproduct( String title, Category category,String description,double price,String imageurl)
//    {
//
//    }

    @Override
    public product updateproduct(Long productid, productdtos product) {
        return null;


    }
}
