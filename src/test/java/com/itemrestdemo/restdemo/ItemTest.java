package com.itemrestdemo.restdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.ItemDAO;
import com.model.Item;

@SpringBootTest
public class ItemTest {
	@Autowired
	ItemDAO dao;
	
	@Test
	void test() {
		Item item = new Item();
		item.setPrice(20);
		item.setItemName("sand");
		item.setQuantity(100);
		dao.save(item);
		
		Item i = dao.findById(item.getItemId()).get();
		Assertions.assertEquals(item.getItemId(), i.getItemId());
	}
	
	@Test
	void testprice() {
		Item item = new Item();
		item.setPrice(20);
		item.setItemName("sand2");
		item.setQuantity(100);
		dao.save(item);
		
		Item i = dao.findByPrice(20).get(0);
		Assertions.assertEquals(item.getPrice(), i.getPrice());
	}
	
	
}
