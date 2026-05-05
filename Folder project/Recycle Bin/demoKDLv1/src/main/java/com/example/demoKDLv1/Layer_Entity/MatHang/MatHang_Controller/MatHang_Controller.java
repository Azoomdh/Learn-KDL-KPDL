package com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatHang_Controller {

    @GetMapping(value={"/MatHang", "/MatHang/HomeView"} )
    public String getMatHangHomeView(Model model){
        return "/MatHang/HomeView";
    }
}
