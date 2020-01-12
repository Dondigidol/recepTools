package application.controllers;

import application.entities.OrderInfo;
import application.entities.Product;
import application.repositories.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @GetMapping("/getorderinfo")
    public List<OrderInfo> getOrderByNo(@RequestParam(value = "order", required = false) Integer order,
                                        @RequestParam(value = "lm", required = false) String lm,
                                        @RequestParam(value = "store", required = false) Integer store,
                                        @RequestParam(value = "date", required = false) String date) throws ParseException{
        if (order != null && lm != null) return orderInfoRepository.findByOrderNoAndItem(order, lm);
        if (order != null) return orderInfoRepository.findByOrderNo(order);
        if (lm != null) return orderInfoRepository.findByItem(lm);
        if (store != null) return orderInfoRepository.findByLocation(store);
        if (date != null) return orderInfoRepository.findByCreatedDateContaining(new SimpleDateFormat().parse(date));
        return null;
    }

}
