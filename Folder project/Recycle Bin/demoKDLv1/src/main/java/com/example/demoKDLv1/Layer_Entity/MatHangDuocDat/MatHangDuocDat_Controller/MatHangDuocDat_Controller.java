package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatHangDuocDat_Controller {

    @GetMapping(value={"/Mhdd", "/Mhdd/HomeView"} )
    public String getMhddHomeView(Model model){
        return "/Mhdd/HomeView";
    }
}
