package com.example.demoKDLv1.DTO;

import java.sql.Timestamp;

import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

public class NgayConfigDetail {
    private String min;
    private String max;

    public Timestamp getGiaTri(){
        return Faker_Util.getTimestampBetween(min, max);
    }

    public NgayConfigDetail(String min, String max) {
        this.min = min;
        this.max = max;
    }

    
}
