package dev.pulkit.productservice.Controller;

import dev.pulkit.productservice.Services.productservice;
import dev.pulkit.productservice.dtos.getsingleproductdtos;
import dev.pulkit.productservice.dtos.productdtos;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class productcontroller {
    private  productservice ps;
    public productcontroller(productservice ps)
    {
        this.ps=ps;
    }

    @GetMapping()
    public String getallproducts()
    {
        return "all products";
    }

    @GetMapping("/{productid}")
    public getsingleproductdtos getsingleproducts(@PathVariable("productid") Long productid)
    {
        return new getsingleproductdtos(ps.getsingleproduct(productid));
    }

    @PostMapping("/")
    public productdtos addnewproduct(@RequestBody productdtos productdto)
    {
        return productdto;
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
