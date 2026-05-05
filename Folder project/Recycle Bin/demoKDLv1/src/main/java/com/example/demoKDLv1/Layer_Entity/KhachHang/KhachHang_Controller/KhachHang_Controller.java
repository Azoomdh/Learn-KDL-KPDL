package com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KhachHang_Controller {
    
    @GetMapping(value={"/KhachHang", "/KhachHang/HomeView"})
    public String getKhachHangHomeView(Model model){
        return "/KhachHang/HomeView";
    }
}
