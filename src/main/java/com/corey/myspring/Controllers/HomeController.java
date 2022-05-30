package com.corey.myspring.Controllers;

import com.corey.myspring.Models.UserModel;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDate.*;
import java.util.Date;

@Controller
//@RequestMapping("src/main/resources/static")
public class HomeController {
    @GetMapping("/")
    public String index(Model model){

        return "index";

    }
//    @GetMapping("/home")
//    static String HomeIndex(Model model){
//        return "index";
//    }
//    @GetMapping("/")
//    static String index(Model model){
//        UserModel u = new UserModel();
//        u.setFirstName("Corey");
//        u.setLastName("Adams");
//        model.addAttribute("user",u);
//        return "index";
//    }
//    @GetMapping("/Home")
//    static ModelAndView UserForm(Model model){
//
//        UserModel u = new UserModel();
//        u.setFirstName("Corey");
//        u.setLastName("Adams");
//        model.addAttribute("user",u);
//        return "index";
//    }
}
