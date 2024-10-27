package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
       
        //sending data to view
        model.addAttribute("name", "substring technologies");
        model.addAttribute("YoutubeChannel" , "Learn Code with durgesh");
        model.addAttribute("GithubRepository", "https://github.com/shawshalini");
        return "home";
    }
    //route
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", "false");
        System.out.println("About Page loading");
        return "about";
    }
    //services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services page loading");
        return "services";
    }
    
    

}
