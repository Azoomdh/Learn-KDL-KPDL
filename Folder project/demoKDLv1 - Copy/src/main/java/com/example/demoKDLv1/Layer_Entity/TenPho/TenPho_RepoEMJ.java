package com.example.demoKDLv1.Layer_Entity.TenPho;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TenPho_RepoEMJ {

    @PersistenceContext
    private EntityManager entityManager;

    public List<TenPho> getRandomTenPho(Integer soLuong){
        String jpqlString = "SELECT k FROM TenPho k ORDER BY FUNCTION('NEWID')";

        List<TenPho> listTenPho = 
            entityManager
                .createQuery(jpqlString, TenPho.class)
                .setMaxResults(soLuong)
                .getResultList();
        
        return listTenPho;
    }
}
