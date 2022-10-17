package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.model.Item;

public interface ItemDAO extends JpaRepository<Item, Integer>{
	List<Item> findByItemName(String name);
		
	List<Item> findByPrice(float price);
}
