package com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class MatHangDuocLuuTru_Key implements Serializable{
    @Column(name= "mach")
    private Long cuaHang_IdEmbedded;

    @Column(name= "mamh")
    private Long matHang_IdEmbedded;

    public MatHangDuocLuuTru_Key() {
        // ...
    }

    public MatHangDuocLuuTru_Key(Long cuaHang_IdEmbedded, Long matHang_IdEmbedded) {
        this.cuaHang_IdEmbedded = cuaHang_IdEmbedded;
        this.matHang_IdEmbedded = matHang_IdEmbedded;
    }

    
}
