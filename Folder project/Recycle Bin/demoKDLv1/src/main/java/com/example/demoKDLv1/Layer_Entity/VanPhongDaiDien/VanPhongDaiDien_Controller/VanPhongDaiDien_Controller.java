package com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VanPhongDaiDien_Controller{

    @GetMapping(value={"/Vpdd", "/Vpdd/HomeView"} )
    public String getVpddHomeView(Model model){
        return "/Vpdd/HomeView";
    }
}