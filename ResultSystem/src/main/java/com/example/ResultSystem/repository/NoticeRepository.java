package com.example.ResultSystem.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ResultSystem.model.Notice;

@Repository
@Qualifier("notRepo")
public interface NoticeRepository extends JpaRepository<Notice, Integer>{
	

}
