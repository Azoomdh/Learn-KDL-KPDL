package com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class MatHangDuocLuuTru {
    
    @EmbeddedId
    private MatHangDuocLuuTru_Key mhdltKey= new MatHangDuocLuuTru_Key();

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 là khóa ngoại và là khóa chính
    @ManyToOne
    @MapsId("cuaHang_IdEmbedded")
    @JoinColumn(name = "mach")
    CuaHang cuaHang;
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
    
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 là khóa ngoại và là khóa chính
    @ManyToOne
    @MapsId("matHang_IdEmbedded")
    @JoinColumn(name = "mamh")
    MatHang matHang;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 
    private Integer soluongtrongkho;
    
    private Timestamp thoigianluutru;

    public MatHangDuocLuuTru() {
        // ...
    }

    public MatHangDuocLuuTru(CuaHang cuaHang, MatHang matHang, Integer soluongtrongkho, Timestamp thoigianluutru) {
        this.mhdltKey= new MatHangDuocLuuTru_Key();
        this.setCuaHang(cuaHang);
        this.setMatHang(matHang);
        this.mhdltKey = new MatHangDuocLuuTru_Key(this.getCuaHang().getMaCH(), this.getMatHang().getMaMH());
        this.soluongtrongkho = soluongtrongkho;
        this.thoigianluutru = thoigianluutru;
    }

    public void updateNotId(MatHangDuocLuuTru mhdlt2){
        // this.setCuaHang(this.getCuaHang());
        // this.setMatHang(this.getMatHang());
        this.setSoluongtrongkho(mhdlt2.getSoluongtrongkho());
        this.setThoigianluutru(mhdlt2.getThoigianluutru());
    }

    public void setCuaHang(CuaHang cuahang2){
        this.cuaHang= cuahang2;
        this.getMhdltKey().setCuaHang_IdEmbedded(cuahang2.getMaCH());
        
        return;
    }

    public void setMatHang(MatHang mathang2){
        this.matHang= mathang2;
        this.getMhdltKey().setMatHang_IdEmbedded(mathang2.getMaMH());

        return;
    }
}
