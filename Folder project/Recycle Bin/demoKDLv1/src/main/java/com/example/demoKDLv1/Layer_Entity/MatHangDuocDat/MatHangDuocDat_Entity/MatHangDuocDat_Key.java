package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class MatHangDuocDat_Key implements Serializable{

    @Column(name= "madon")
    private Long donDatHang_IdEmbedded;

    @Column(name= "mamh")
    private Long matHang_IdEmbedded;

    public MatHangDuocDat_Key(Long donDatHang_IdEmbedded, Long matHang_IdEmbedded) {
        this.donDatHang_IdEmbedded = donDatHang_IdEmbedded;
        this.matHang_IdEmbedded = matHang_IdEmbedded;
    }

    public MatHangDuocDat_Key() {
        // ...
    }

    
}
