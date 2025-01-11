package com.example.ResultSystem.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ResultSystem.model.Profile;

@Repository
@Qualifier("proRepo")
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
