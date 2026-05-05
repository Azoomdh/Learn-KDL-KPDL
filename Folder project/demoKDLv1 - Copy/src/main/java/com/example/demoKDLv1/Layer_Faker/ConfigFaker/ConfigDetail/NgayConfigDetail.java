package com.example.demoKDLv1.Layer_Faker.ConfigFaker.ConfigDetail;

import java.sql.Timestamp;
import java.time.Instant;

import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

public class NgayConfigDetail {
    private String min;
    private String max;
    private Boolean modeReturnNow;

    public Timestamp getGiaTri(){
        if(this.modeReturnNow== true){
            return Timestamp.from( Instant.now() );
        }

        else {
            return Faker_Util.getTimestampBetween(min, max);
        }
    }

    public NgayConfigDetail(String min, String max, Boolean modeReturnNow) {
        this.min = min;
        this.max = max;
        this.modeReturnNow = modeReturnNow;
    }

}
