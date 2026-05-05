package com.example.demoKDLv1.Layer_Faker.FakerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Service;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Service;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.Layer_Faker.FakerEntity.MatHangDuocLuuTruFaker;


// @Transactional
@Service
public class MatHangDuocLuuTruFS {
    @Autowired
    private AllEntityConfig allEntityConfig;

    @Autowired
    private MatHangDuocLuuTru_Service mhdlt_Service;

    @Autowired
    private MatHang_Service mh_Service;

    public MatHangDuocLuuTru createMhdlt(CuaHang ch1, MatHang mh1){
        MatHangDuocLuuTru mhdlt1 = MatHangDuocLuuTruFaker.createFakeMhdlt(ch1, mh1, this.allEntityConfig);

        mhdlt1 = this.mhdlt_Service.createMhdlt(mhdlt1);

        return mhdlt1;
    }

    public List<MatHangDuocLuuTru> createMhdlt(CuaHang ch1, Integer soLuong){
        List<MatHang> listMh = null;
        List<MatHangDuocLuuTru> listMhdlt = null;

        listMh = this.mh_Service.getRandomMathang(soLuong);
        listMhdlt = new ArrayList<>();

        for(MatHang mh1 : listMh){
            MatHangDuocLuuTru mhdlt1 = this.createMhdlt(ch1, mh1);

            listMhdlt.add(mhdlt1);
        }

        return listMhdlt;
    }

    public List<MatHangDuocLuuTru> createMhdlt_v2(CuaHang ch1, Integer soLuong){
        List<MatHang> listMh = null;
        List<MatHangDuocLuuTru> listMhdlt = null;

        listMh = this.mh_Service.getRandomMathang(soLuong);
        listMhdlt = MatHangDuocLuuTruFaker.createFakeMhdlt(ch1, listMh, allEntityConfig);

        listMhdlt = this.mhdlt_Service.createAllMhdlt(listMhdlt);

        return listMhdlt;
    }

}
