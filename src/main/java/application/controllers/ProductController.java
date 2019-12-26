package application.controllers;

import application.entities.Item;
import application.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/getproduct")
    public Product getItem(@RequestParam(value="lm", required = true) String lm){
        Product product = new Product();
        product.setLm(lm);
        product.setEan("1234567891011");
        product.setName("Обои флизилиновые");
        return product;
    }

}
