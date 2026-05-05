package com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity;

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
public class KhachHangDuLich extends KhachHang {
    private String huongdanviendulich;

    public KhachHangDuLich(){
        // ...
    }

    public KhachHangDuLich
        (
            Long maKH, 
            String tenKH, 
            Timestamp ngaydathangdautien, 
            VanPhongDaiDien vpdd, 
            String huongdanviendulich
        ) 
        
        {
            super(maKH, tenKH, ngaydathangdautien, vpdd);
            this.huongdanviendulich = huongdanviendulich;
        }

    public KhachHangDuLich
        (
            KhachHang kh1, 
            String huongdanviendulich
        )
        
        {
            super(
                kh1.getMaKH(),
                kh1.getTenKH(),
                kh1.getNgaydathangdautien(),
                kh1.getVpdd()
            );
            this.huongdanviendulich= huongdanviendulich;
        }
    
    public void updateNotId(KhachHangDuLich khdl2){
        // this.setMaKH(this.getMaKH());
        this.setTenKH(khdl2.getTenKH());
        this.setNgaydathangdautien(khdl2.getNgaydathangdautien());
        this.setVpdd(khdl2.getVpdd());
        this.setHuongdanviendulich(khdl2.getHuongdanviendulich());
    }
}
