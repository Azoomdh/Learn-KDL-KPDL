package com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KhachHangBuuDien_Controller {
    
    @GetMapping(value = {"/Khbd", "/Khbd/HomeView"})
    public String getKhbdHomeView(Model model){
        return "/Khbd/HomeView";
    }
}
