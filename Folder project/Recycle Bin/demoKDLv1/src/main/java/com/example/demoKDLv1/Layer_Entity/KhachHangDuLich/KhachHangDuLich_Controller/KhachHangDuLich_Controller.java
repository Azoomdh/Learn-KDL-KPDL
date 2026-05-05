package com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KhachHangDuLich_Controller {

    @GetMapping(value = {"/Khdl", "/Khdl/HomeView"})
    public String getKhdlHomeView(Model model){
        return "/Khdl/HomeView";
    }
}
