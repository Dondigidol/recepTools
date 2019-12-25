package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/defectlist")
    public String reqHome(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "defectlist";
    }




}
