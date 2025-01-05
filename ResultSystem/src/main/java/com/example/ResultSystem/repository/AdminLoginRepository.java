package com.example.ResultSystem.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ResultSystem.model.AdminLogin;

@Repository
@Qualifier("adRepo")
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Integer>{
	AdminLogin findAllByEmailidAndPassword(String emailid,String password);

}
