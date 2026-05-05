package com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatHangDuocLuuTru_Controller {

    @GetMapping(value={"/Mhdlt", "/Mhdlt/HomeView"} )
    public String getMhdltHomeView(Model model){
        return "/Mhdlt/HomeView";
    }
}
