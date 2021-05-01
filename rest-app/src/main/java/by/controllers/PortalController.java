package by.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalController {
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("title", "Тестовая страница");
        return "test";
    }
}
