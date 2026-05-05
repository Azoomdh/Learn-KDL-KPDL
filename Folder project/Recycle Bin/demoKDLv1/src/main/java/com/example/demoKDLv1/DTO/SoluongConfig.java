package com.example.demoKDLv1.DTO;

import lombok.Data;

@Data
public class SoluongConfig {
    private SoluongConfigDetail mathang;
    private SoluongConfigDetail vpdd;
    
    private SoluongConfigDetail cuahang;
        private SoluongConfigDetail mhdlt;
    
    private SoluongConfigDetail khachhang;
        private SoluongConfigDetail ddh;
            private SoluongConfigDetail mhdd;

    

    private SoluongConfigDetail khdl;
    private SoluongConfigDetail khbd;
    public SoluongConfig
        (
            SoluongConfigDetail mathang, SoluongConfigDetail vpdd, SoluongConfigDetail cuahang,
            SoluongConfigDetail khachhang, SoluongConfigDetail ddh, SoluongConfigDetail mhdd, 
            SoluongConfigDetail mhdlt, SoluongConfigDetail khdl, SoluongConfigDetail khbd
        )
    {
        this.mathang = mathang;
        this.vpdd = vpdd;
        this.cuahang = cuahang;
        this.khachhang = khachhang;
        this.ddh = ddh;
        this.mhdd = mhdd;
        this.mhdlt = mhdlt;
        this.khdl = khdl;
        this.khbd = khbd;
    }
    public SoluongConfig() {
        // ...
    }


}
