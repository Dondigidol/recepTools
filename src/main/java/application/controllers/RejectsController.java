package application.controllers;

import application.entities.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RejectsController {

    @PostMapping("/saveitem")
    public void saveItem(@RequestParam(value="lm", required = false) String lm,
                         @RequestParam(value="sku", required = false) String ean,
                         @RequestParam(value="name", required = false) String name,
                         @RequestParam(value="orderId", required = false) String orderId,
                         @RequestParam(value="recepDate", required = false) String recepDate,
                         @RequestParam(value="recepId", required = false) String recepId,
                         @RequestParam(value="quantity", required = false, defaultValue = "0") int quantity,
                         @RequestParam(value="supplierId", required = false) String supplierId,
                         @RequestParam(value="supplierName", required = false) String supplierName,
                         @RequestParam(value="department", required = false) String department,
                         @RequestParam(value="reason", required = false) String reason,
                         Model model){
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

        model.addAttribute("output", "Ok!");
    }

    @GetMapping("/saveitem")
    public void saveItem(){

    }

}
