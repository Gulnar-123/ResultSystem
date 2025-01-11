package com.example.ResultSystem.service;

import java.util.List;

import com.example.ResultSystem.model.Profile;

public interface ProfileService {
Profile insert(Profile p);
List<Profile> getAll();
Profile search(int id);
Profile update(int id,Profile p);
}
