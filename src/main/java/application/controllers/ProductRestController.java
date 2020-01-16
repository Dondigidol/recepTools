package application.controllers;

import application.entities.*;
import application.repositories.dataplatformDB.OrderReceiveChainRepository;
import application.repositories.dataplatformDB.OrderRepository;
import application.repositories.dataplatformDB.ShipmentRepository;
import application.repositories.dataplatformDB.SupplierRepository;
import application.repositories.locdevDB.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    SupplierRepository supplierRepository;

    @Autowired
    ShipmentRepository shipmentRepository;

    @Autowired
    OrderReceiveChainRepository orderReceiveChainRepository;

    @GetMapping("/getproduct")
    public List<Product> getItem(@RequestParam(value="lm") String lm){
        return productRepository.findByLm(lm);
    }

    @RequestMapping("/getdelivery")
    public void getDelivery(@RequestParam(value="lm") String lm){

    }

    @GetMapping("/getorderinfo")
    public List<Order> getOrderByNo(@RequestParam(value = "store", required = false) Integer store,
                                    @RequestParam(value = "order", required = false) Integer order,
                                    @RequestParam(value = "lm", required = false) String lm,
                                    @RequestParam(value = "date", required = false) String date) throws ParseException{
        if (order != null && lm != null) return orderRepository.findByOrderNoAndItem(order, lm);
        if (order != null) return orderRepository.findByOrderNo(order);
        if (lm != null && store != null) return orderRepository.findByStoreAndItem(store, lm);
        if (date != null && store !=null) return orderRepository.findByStoreAndCreatedDateContaining(store, new SimpleDateFormat().parse(date));
        return null;
    }

    @GetMapping("/getsupplier")
    public List<Supplier> getSupplier(@RequestParam("id") long id){
        return supplierRepository.findById(id);
    }

    @GetMapping("/getshipment")
    public List<Shipment> getShipment(@RequestParam(value = "id", required = false) Long id,
                                      @RequestParam(value = "lm", required = false) String lm){
        if (id!=null && lm!=null) return shipmentRepository.findByIdAndLm(id, lm);
        if(id!=null) return shipmentRepository.findByShipmentId(id);
        if(lm!=null) return shipmentRepository.findByLm(lm);
        return null;
    }

    @GetMapping("/getreceive")
    public List<OrderReceiveChain> getOrderReceiveInfo(@RequestParam(value = "order", required = false) Long orderNo,
                                                       @RequestParam(value = "shipment",required = false) Long shipment){
        if (orderNo != null) return orderReceiveChainRepository.findByOrderNo(orderNo);
        if (shipment != null) return orderReceiveChainRepository.findByShipment(shipment);
        return null;
    }

}
