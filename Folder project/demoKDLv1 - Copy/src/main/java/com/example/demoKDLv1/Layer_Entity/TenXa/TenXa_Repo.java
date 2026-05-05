package com.example.demoKDLv1.Layer_Entity.TenXa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface TenXa_Repo 
    extends JpaRepository<TenXa, Long>
{

}
