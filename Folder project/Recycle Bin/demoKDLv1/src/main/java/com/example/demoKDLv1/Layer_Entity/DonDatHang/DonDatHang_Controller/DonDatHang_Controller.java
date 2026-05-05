package com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonDatHang_Controller {

    @GetMapping(value={"/Ddh", "/Ddh/HomeView"})
    public String getDdhHomeView(Model model){
        return "/Ddh/HomeView";
    }
}
