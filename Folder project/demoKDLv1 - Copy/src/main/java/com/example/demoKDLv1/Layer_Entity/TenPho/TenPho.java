package com.example.demoKDLv1.Layer_Entity.TenPho;

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
public class TenPho {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long maPho;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String tenPho;
}
