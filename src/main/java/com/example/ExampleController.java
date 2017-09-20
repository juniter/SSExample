package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {
    @RequestMapping("/sayHello")
    public String example(Model model) {
        model.addAttribute("title", "SpringmvcTest");
        return "hello";
    }
}
