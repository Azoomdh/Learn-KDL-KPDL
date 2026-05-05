package com.example.demoKDLv1.Layer_Entity.TenXa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TenXa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long maXa;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String tenXa;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String tenTinh;


}
