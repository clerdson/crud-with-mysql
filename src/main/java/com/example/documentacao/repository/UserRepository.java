package com.example.documentacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.documentacao.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
