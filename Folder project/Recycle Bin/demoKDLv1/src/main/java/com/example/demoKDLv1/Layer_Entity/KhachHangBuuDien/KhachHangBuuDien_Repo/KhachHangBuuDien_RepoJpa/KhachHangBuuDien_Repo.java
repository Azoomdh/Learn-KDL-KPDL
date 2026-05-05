package com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Repo.KhachHangBuuDien_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;

@Repository
public interface KhachHangBuuDien_Repo 
    extends JpaRepository<KhachHangBuuDien, Long>
{

}
