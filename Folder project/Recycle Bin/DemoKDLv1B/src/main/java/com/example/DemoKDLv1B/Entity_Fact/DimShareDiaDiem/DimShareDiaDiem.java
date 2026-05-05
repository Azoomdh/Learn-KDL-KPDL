package com.example.DemoKDLv1B.Entity_Fact.DimShareDiaDiem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class DimShareDiaDiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiaDiem;

    private String bang;

    private 
}
