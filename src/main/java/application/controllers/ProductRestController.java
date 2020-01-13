package application.controllers;

import application.entities.OrderInfo;
import application.entities.Product;
import application.repositories.OrderInfoRepository;
import application.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    OrderInfoRepository orderInfoRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/getproduct")
    public List<Product> getItem(@RequestParam(value="lm") String lm){
        return productRepository.findByLm(lm);
    }

    @RequestMapping("/getdelivery")
    public void getDelivery(@RequestParam(value="lm") String lm){

    }

    @GetMapping("/getorderinfo")
    public List<OrderInfo> getOrderByNo(@RequestParam(value = "store", required = false) Integer store,
                                        @RequestParam(value = "order", required = false) Integer order,
                                        @RequestParam(value = "lm", required = false) String lm,
                                        @RequestParam(value = "date", required = false) String date) throws ParseException{
        if (order != null && lm != null) return orderInfoRepository.findByOrderNoAndItem(order, lm);
        if (order != null) return orderInfoRepository.findByOrderNo(order);
        if (lm != null && store != null) return orderInfoRepository.findByStoreAndItem(store, lm);
        if (date != null && store !=null) return orderInfoRepository.findByStoreAndCreatedDateContaining(store, new SimpleDateFormat().parse(date));
        return null;
    }

}
