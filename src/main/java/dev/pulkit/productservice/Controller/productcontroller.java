package dev.pulkit.productservice.Controller;

import dev.pulkit.productservice.Models.product;
import dev.pulkit.productservice.Services.productservice;
import dev.pulkit.productservice.dtos.getsingleproductdtos;
import dev.pulkit.productservice.dtos.productdtos;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class productcontroller {
    private  productservice ps;
    public productcontroller(productservice ps)
    {
        this.ps=ps;
    }

    @GetMapping()
    public List<product>getallproducts()
    {
        return ps.getallproducts();
    }

    @GetMapping("/{productid}")
    public ResponseEntity<product> getsingleproducts(@PathVariable("productid") Long productid)
    {
        ResponseEntity<product> response=new ResponseEntity<product>(
                ps.getsingleproduct(productid),
                HttpStatus.OK
        );
        return response;
    }

    @PostMapping("/")
    public ResponseEntity<product> addnewproduct(@RequestBody productdtos product1)
    {
        product prod1=ps.addnewproduct(product1);
        ResponseEntity<product> response=new ResponseEntity<>(
                prod1,HttpStatus.OK
        );
        return response;


    }

    @PutMapping("/{productid}")
    public String updateproduct(@RequestBody productdtos productdto,@PathVariable("productid") Long productid)
    {
           return "updated"+ productid+"with description"+productdto;
    }

    @DeleteMapping("/{productid}")
    public String deleteproduct(@PathVariable("productid") Long productid)
    {
        return "deleted"+ productid;
    }


}
