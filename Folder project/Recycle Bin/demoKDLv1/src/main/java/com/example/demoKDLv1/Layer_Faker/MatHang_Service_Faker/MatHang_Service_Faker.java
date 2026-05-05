package com.example.demoKDLv1.Layer_Faker.MatHang_Service_Faker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Service.MatHang_Service;

@Service
public class MatHang_Service_Faker {

    @Autowired
    MatHang_Service mathang_Service;

    public MatHang createMotMathang(){
        MatHang mathang1= MatHang_Faker.createFakeMathang();

        mathang1= this.mathang_Service.createMathang(mathang1);

        return mathang1;
    }

    public List<MatHang> createNhieuMathang(SoluongConfig soluongConfig){
        List<MatHang> listMathang= new ArrayList<>();

        for(int i=0; i<soluongConfig.getMathang().getGiaTri(); i++){
            MatHang mathang1= this.createMotMathang();

            listMathang.add(mathang1);
        }

        // listMathang= this.mathang_Service.createAllMathang(listMathang);
        // save 1 loạt code không giống như của Vpdd

        return listMathang;
    }
}