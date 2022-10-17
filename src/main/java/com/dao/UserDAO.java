package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.UserTable;

public interface UserDAO extends JpaRepository<UserTable, Integer>{

}
