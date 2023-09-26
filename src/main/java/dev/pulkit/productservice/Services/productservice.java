package dev.pulkit.productservice.Services;

import dev.pulkit.productservice.Models.product;
import dev.pulkit.productservice.dtos.productdtos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface productservice {
    List<product> getallproducts();
    product getsingleproduct(Long productid);
    boolean deleteproduct(Long productid);
    product addnewproduct(productdtos product);
    product updateproduct(Long productid,productdtos product);

}
