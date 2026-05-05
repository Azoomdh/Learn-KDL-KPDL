package com.example.demoKDLv1.Layer_Faker.VanPhongDaiDien_Service_Faker;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;
import net.datafaker.providers.base.Address;

@Data
public class VanPhongDaiDien_Faker {

    private static String minDate= "01:01:2020 00:00:00";
    private static String maxDate= "01:01:2025 00:00:00";

    public static VanPhongDaiDien createFakeVpdd(){
        Long maTP= null;
        String tenTP= null;
        String diachivanphong= null;
        String bang= null;
        Timestamp thoigianlapvanphong= null;
        
        maTP= null;
        Address address1= Faker_Util.getAddress();
        tenTP= address1.cityName();
        diachivanphong= address1.fullAddress();
        bang= address1.state();
        thoigianlapvanphong= Faker_Util.getTimestampBetween(VanPhongDaiDien_Faker.minDate, VanPhongDaiDien_Faker.maxDate);

        VanPhongDaiDien vpdd1= new VanPhongDaiDien(maTP, tenTP, diachivanphong, bang, thoigianlapvanphong);

        return vpdd1;
    }
}
