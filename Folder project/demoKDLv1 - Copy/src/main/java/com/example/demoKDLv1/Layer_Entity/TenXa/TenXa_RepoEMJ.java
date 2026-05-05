package com.example.demoKDLv1.Layer_Entity.TenXa;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TenXa_RepoEMJ {

    @PersistenceContext
    private EntityManager entityManager;

    public List<TenXa> getRandomTenXa(Integer soLuong){
        String jpqlString = "SELECT k FROM TenXa k ORDER BY FUNCTION('NEWID')";

        List<TenXa> listTenXa =
            entityManager
                .createQuery(jpqlString, TenXa.class)
                .setMaxResults(soLuong)
                .getResultList();

        return listTenXa;

    }
}
