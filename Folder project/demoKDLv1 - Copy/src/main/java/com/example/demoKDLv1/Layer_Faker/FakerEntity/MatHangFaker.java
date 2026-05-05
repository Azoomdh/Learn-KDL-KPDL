package com.example.demoKDLv1.Layer_Faker.FakerEntity;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;
import net.datafaker.Faker;
import net.datafaker.providers.base.Commerce;

@Data
public class MatHangFaker {
    public static MatHang createFakeMatHang(AllEntityConfig allConfig){
        Long maMH= null;
        String mota= null;
        String size= null;
        Double trongluong= null;
        Long gia= null;
        Timestamp thoigiannhaphang= null;

        // Faker faker1= new Faker();
        // Commerce sanpham1= faker1.commerce();

        Commerce sanpham1 = Faker_Util.getSanpham();

        maMH = null;
        mota = sanpham1.productName();
        size = allConfig.getMathang().getSize().getGiaTri();
        trongluong = allConfig.getMathang().getTrongLuong().getGiaTri();
        gia = allConfig.getMathang().getGia().getGiaTri();
        thoigiannhaphang = allConfig.getMathang().getThoigiannhaphang().getGiaTri();

        MatHang mh1 = new MatHang(maMH, mota, size, trongluong, gia, thoigiannhaphang);

        return mh1;
    }

}
