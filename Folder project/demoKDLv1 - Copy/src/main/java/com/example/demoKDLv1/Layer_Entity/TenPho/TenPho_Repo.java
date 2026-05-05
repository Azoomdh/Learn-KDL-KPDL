package com.example.demoKDLv1.Layer_Entity.TenPho;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface TenPho_Repo 
    extends JpaRepository<TenPho, Long>
{

}
