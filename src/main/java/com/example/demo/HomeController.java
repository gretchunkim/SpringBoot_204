package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carjavabean")
    public String loadCarjavabeanForm(Model model){
        model.addAttribute("carjavabean",new Carjavabean());
        return "carjavabean";
    }

    @PostMapping ("/carjavabean")
    public String processCarjavabeanForm(@Valid Carjavabean carjavabean,
        BindingResult result){
        if (result.hasErrors()){
            return "carjavabean";
        }
        return "carjavabeanconfirm";
    }

}
