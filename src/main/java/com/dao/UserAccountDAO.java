package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.UserAccount;

public interface UserAccountDAO extends JpaRepository<UserAccount, Integer>{

}
