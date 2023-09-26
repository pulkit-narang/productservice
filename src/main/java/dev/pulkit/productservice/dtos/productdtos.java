package dev.pulkit.productservice.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class productdtos {
     private Long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

}
