package com.example.DbUsingProfile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DbUsingProfile.Entity.userEntity;
@Repository
public interface repo extends JpaRepository<userEntity, Integer> {

}
