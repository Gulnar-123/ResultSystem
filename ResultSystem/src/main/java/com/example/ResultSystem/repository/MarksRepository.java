package com.example.ResultSystem.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ResultSystem.model.Marks;

@Repository
@Qualifier("marksRepo")
public interface MarksRepository extends JpaRepository<Marks, Integer>{

}
