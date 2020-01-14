package application.controllers;

import application.entities.Item;
import application.repositories.RejectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RejectsController {

    @PostMapping("/saveitem")
    public void saveItem(@RequestParam(name="lm", required = false) String lm,
                         @RequestParam(name="ean", required = false) String ean,
                         @RequestParam(name="name", required = false) String name,
                         @RequestParam(name="orderId", required = false) String orderId,
                         @RequestParam(name="recepDate", required = false) String recepDate,
                         @RequestParam(name="recepId", required = false) String recepId,
                         @RequestParam(name="quantity", required = false, defaultValue = "0") int quantity,
                         @RequestParam(name="supplierName", required = false) String supplierName,
                         @RequestParam(name="department", required = false) String department,
                         @RequestParam(name="reason", required = false) String reason,
                         Model model){
        Item item=new Item();
        item.setLm(lm);
        item.setEan(ean);
        item.setName(name);
        item.setOrderId(orderId);
        item.setRecepDate(recepDate);
        item.setRecepId(recepId);
        item.setQuantity(quantity);
        item.setSupplierName(supplierName);
        item.setDepartment(department);
        item.setReason(reason);
        //rejectRepository.save(item);


        model.addAttribute("output", item.toString());

    }

    @GetMapping("/saveitem")
    public void saveItem(){

    }

}
