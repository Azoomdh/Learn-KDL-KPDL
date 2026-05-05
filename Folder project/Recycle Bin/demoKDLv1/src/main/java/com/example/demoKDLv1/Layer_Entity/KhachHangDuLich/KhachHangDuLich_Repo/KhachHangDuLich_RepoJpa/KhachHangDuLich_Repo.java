package com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Repo.KhachHangDuLich_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;

@Repository
public interface KhachHangDuLich_Repo 
    extends JpaRepository<KhachHangDuLich, Long>
{

}
