package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/category")
public class categorycontroller {

    @GetMapping()
    public String getallcat()
    {
        return "all cats";
    }
    @GetMapping("/{categoryid}")
    public String getcatwithid(@PathVariable("categoryid") Long catid)
    {
        return "cat with id"+ catid;
    }

}
