package application.controllers;

import application.entities.OrderInfo;
import application.entities.Product;
import application.repositories.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    OrderInfoRepository orderInfoRepository;

    @RequestMapping("/getproduct")
    public Product getItem(@RequestParam(value="lm") String lm){
        Product product = new Product();
        product.setLm(lm);
        product.setEan("1234567891011");
        product.setName("Обои флизилиновые");
        return product;
    }

    @RequestMapping("/getdelivery")
    public void getDelivery(@RequestParam(value="lm") String lm){

    }

    @RequestMapping(value = "/getorderinfo", method = RequestMethod.GET)
    public List<OrderInfo> getOrderInfo(@RequestParam(value="lm") String lm){
        System.out.println(orderInfoRepository.findByItem(lm));
        return orderInfoRepository.findByItem(lm);
    }

}
