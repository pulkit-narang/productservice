package dev.pulkit.productservice.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category extends basemodel {
    private String name;

    public void setname(String name) {
        this.name=name;
    }
}
