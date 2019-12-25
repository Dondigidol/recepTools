package application.controllers;

import application.entities.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @RequestMapping("/getitem")
    public Item getItem(@RequestParam(value="lm", required = true) int lm){
        Item item = new Item();
        item.setLm(lm);
        item.setEan("1234567891011");
        item.setDepartment(1);
        item.setName("Обои виниловые");
        item.setOrderId(12384902);
        item.setRecepId(23123123);
        return item;
    }

    @RequestMapping("/saveitem")
    public Item saveItem(@RequestParam(value="lm", required = false) int lm,
                         @RequestParam(value="sku", required = false) String ean,
                         @RequestParam(value="name", required = false) String name,
                         @RequestParam(value="orderId", required = false) int orderId,
                         @RequestParam(value="recepDate", required = false) String recepDate,
                         @RequestParam(value="recepId", required = false) int recepId,
                         @RequestParam(value="quantity", required = false) int quantity,
                         @RequestParam(value="supplierId", required = false) int supplierId,
                         @RequestParam(value="supplierName", required = false) String supplierName,
                         @RequestParam(value="department", required = false) int department,
                         @RequestParam(value="reason", required = false) String reason){
        Item item=new Item();
        item.setLm(lm);
        item.setEan(ean);
        item.setName(name);
        item.setOrderId(orderId);
        item.setRecepDate(recepDate);
        item.setRecepId(recepId);
        item.setQuantity(quantity);
        item.setSupplierId(supplierId);
        item.setSupplierName(supplierName);
        item.setDepartment(department);
        item.setReason(reason);

        return item;
    }

}
