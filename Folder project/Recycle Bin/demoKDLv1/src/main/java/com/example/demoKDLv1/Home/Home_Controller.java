package com.example.demoKDLv1.Home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Home_Controller {

    @GetMapping(value= {"/", "/Home"})
    public String getHomeView(Model model) {
        return "/Home/HomeView";
    }
    
}
