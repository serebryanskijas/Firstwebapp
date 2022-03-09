package org.itstep.spring_thymeleaf_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @GetMapping( value ={"/", "/index"} )
    public String index(Model model) {
        return "index";
    }

    @PostMapping ("/calculate")
    public String calculate(Model model, @RequestParam String a, @RequestParam String b){
        System.out.println(a);
        int av = Integer.parseInt(a);
        int bv = Integer.parseInt(b);
        int sumv = av+bv;
        String sum = String.valueOf(sumv);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("sum",sum);
        return "index";
    }
}
