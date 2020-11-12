package com.example.SpringJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJPA.Model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	Users findByName(String name);
}
