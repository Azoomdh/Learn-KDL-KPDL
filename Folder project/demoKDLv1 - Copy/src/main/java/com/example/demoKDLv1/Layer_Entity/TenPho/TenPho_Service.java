package com.example.demoKDLv1.Layer_Entity.TenPho;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class TenPho_Service {

    @Autowired
    private TenPho_Repo tenPho_Repo;

    @Autowired
    private TenPho_RepoEMJ tenPho_RepoEMJ;

    public List<TenPho> getRandomTenPho(Integer soLuong){
        List<TenPho> listTenPho = this.tenPho_RepoEMJ.getRandomTenPho(soLuong);

        return listTenPho;
    }
}
