package com.example.demoKDLv1.Layer_Faker.FakerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoKDLv1.Layer_Faker.FakerService.MatHangFS;


// @Transactional
@Controller
public class MatHangFC {
    @Autowired
    private MatHangFS mh_FS;
    
    @GetMapping("/Faker/CreateMatHang")
    public String getCreateMatHangView(Model model ){
        return "/Faker/CreateMatHang";
    }

    @PostMapping("/Faker/CreateMatHang/SendForm")
    public String postAtCreateMatHangView
        (
            Model model,
            @RequestParam("soLuong") Integer soLuong1
        )
        {
            this.mh_FS.createMatHang_v2(soLuong1);
            return "redirect:/Faker";
        }
}
