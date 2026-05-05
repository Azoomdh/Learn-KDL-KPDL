package com.example.demoKDLv1.Layer_Entity.TenXa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.TenPho.TenPho;
import com.example.demoKDLv1.Layer_Entity.TenPho.TenPho_Repo;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class TenXa_Service {

    @Autowired
    private TenXa_Repo tenXa_Repo;

    @Autowired
    private TenXa_RepoEMJ tenXa_RepoEMJ;

    public List<TenXa> getRandomTenXa(Integer soLuong){
        List<TenXa> listTenXa = this.tenXa_RepoEMJ.getRandomTenXa(soLuong);

        return listTenXa;
    }
}
