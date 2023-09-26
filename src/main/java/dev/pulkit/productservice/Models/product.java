package dev.pulkit.productservice.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product extends basemodel{
    private Long id;
    private String title;
    private Category category;
    private String description;
    private double price;
    private String imageurl;

}
