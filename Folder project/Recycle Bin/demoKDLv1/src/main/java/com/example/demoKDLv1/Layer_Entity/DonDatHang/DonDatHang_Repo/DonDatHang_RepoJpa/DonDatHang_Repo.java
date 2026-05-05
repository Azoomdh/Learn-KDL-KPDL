package com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Repo.DonDatHang_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;

@Repository
public interface DonDatHang_Repo 
    extends JpaRepository<DonDatHang, Long>
{
    
}
