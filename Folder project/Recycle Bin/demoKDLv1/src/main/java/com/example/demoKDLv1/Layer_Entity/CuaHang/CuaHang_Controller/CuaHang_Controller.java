package com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuaHang_Controller {
    
    @GetMapping(value= {"/CuaHang", "/CuaHang/HomeView"})
    public String getCuaHangHomeView(Model model){
        return "/CuaHang/HomeView";
    }
}
