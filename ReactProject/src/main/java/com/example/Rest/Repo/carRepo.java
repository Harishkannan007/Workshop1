package com.example.Rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Rest.model.cardetails;

public interface carRepo extends JpaRepository<cardetails, Integer> {

}
