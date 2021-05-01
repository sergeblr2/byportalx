package by.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DirectoryController {
    @GetMapping("/directory")
    public String directory(Model model) {
        //model.addAttribute("title", "ТСправочник");
        return "directory-main";
    }
}
