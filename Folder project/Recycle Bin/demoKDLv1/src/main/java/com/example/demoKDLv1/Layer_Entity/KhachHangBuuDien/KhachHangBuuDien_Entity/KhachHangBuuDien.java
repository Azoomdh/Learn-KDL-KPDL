package com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = false)
public class KhachHangBuuDien extends KhachHang{
    
    private String diachibuudien;

    public KhachHangBuuDien(){
        // ...
    }

    public KhachHangBuuDien
        (
            Long maKH, 
            String tenKH, 
            Timestamp ngaydathangdautien, 
            VanPhongDaiDien vpdd, 
            String diachibuudien
        ) 
        
        {
            super(maKH, tenKH, ngaydathangdautien, vpdd);
            this.diachibuudien = diachibuudien;
        }

    public KhachHangBuuDien(KhachHang kh1, String diachibuudien){
        super(
            kh1.getMaKH(),
            kh1.getTenKH(),
            kh1.getNgaydathangdautien(),
            kh1.getVpdd()
        );
        this.diachibuudien= diachibuudien;
    }
    
    public void updateNotId(KhachHangBuuDien khbd2){
        this.setTenKH(khbd2.getTenKH());
        this.setNgaydathangdautien(khbd2.getNgaydathangdautien());
        this.setVpdd(khbd2.getVpdd());
        this.setDiachibuudien(khbd2.getDiachibuudien());
    }
}
