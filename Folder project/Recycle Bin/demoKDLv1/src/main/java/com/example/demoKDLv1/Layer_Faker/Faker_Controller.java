package com.example.demoKDLv1.Layer_Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.DTO.SoluongConfigDetail;
import com.example.demoKDLv1.Layer_Faker.MatHang_Service_Faker.MatHang_Service_Faker;
import com.example.demoKDLv1.Layer_Faker.VanPhongDaiDien_Service_Faker.VanPhongDaiDien_Service_Faker;

import ch.qos.logback.core.model.Model;

@Controller
public class Faker_Controller {

    @Autowired
    private MatHang_Service_Faker mathang_Service_Faker;

    @Autowired
    private VanPhongDaiDien_Service_Faker vpdd_Service_Faker;

    @GetMapping("/Faker")
    public String getFakerView(Model model){
        return "/Faker/HomeView";
    }

    @GetMapping("/Faker/CreateAll")
    public String getFakerCreateAllView(Model model){
        return "/Faker/CreateAll";
    }

    @PostMapping("/Faker/CreateAll/sendForm")
    public String postAtFakerCreateAllView(Model model){
        SoluongConfig soluongConfig= new SoluongConfig();

        soluongConfig.setMathang(new SoluongConfigDetail(100, 300));
        soluongConfig.setVpdd(new SoluongConfigDetail(20, 30));
        soluongConfig.setCuahang(new SoluongConfigDetail(5, 7));
        soluongConfig.setKhachhang(new SoluongConfigDetail(50, 70));
        soluongConfig.setDdh(new SoluongConfigDetail(1, 15));
        soluongConfig.setMhdd(new SoluongConfigDetail(1, 7));
        soluongConfig.setMhdlt(new SoluongConfigDetail(50, 70));

        this.mathang_Service_Faker.createNhieuMathang(soluongConfig);
        this.vpdd_Service_Faker.createNhieuVpdd(soluongConfig);

        return "redirect:/Faker";
    }

}
