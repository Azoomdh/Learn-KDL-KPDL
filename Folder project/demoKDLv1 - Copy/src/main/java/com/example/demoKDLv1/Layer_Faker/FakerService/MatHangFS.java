package com.example.demoKDLv1.Layer_Faker.FakerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Service;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.Layer_Faker.FakerEntity.MatHangFaker;


// @Transactional
@Service
public class MatHangFS {
    @Autowired
    private AllEntityConfig allEntityConfig;

    @Autowired
    private MatHang_Service mathang_Service;

    public MatHang createMathang(){
        MatHang mh1= MatHangFaker.createFakeMatHang(this.allEntityConfig);

        mh1= this.mathang_Service.createMathang(mh1);

        return mh1;
    }

    public List<MatHang> createMatHang(Integer soLuong){
        List<MatHang> listMathang= new ArrayList<>();

        for(int i=0; i<soLuong; i++){
            MatHang mathang1= this.createMathang();

            listMathang.add(mathang1);
        }

        // listMathang= this.mathang_Service.createAllMathang(listMathang);
        // đã save ở hàm createMathang() nên không cần save lần 2

        return listMathang;
    }

    public List<MatHang> createMatHang_v2(Integer soLuong){
        List<MatHang> listMathang= new ArrayList<>();

        for(int i=0; i<soLuong; i++){
            MatHang mh1 = MatHangFaker.createFakeMatHang(this.allEntityConfig);
            listMathang.add(mh1);
        }

        listMathang = this.mathang_Service.createAllMathang(listMathang);

        return listMathang;
    }
}
