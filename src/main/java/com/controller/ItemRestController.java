package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.model.Item;
import com.dao.ItemDAO;

@RestController
public class ItemRestController {
	
	@Autowired
	ItemDAO dao;
	
	@GetMapping("/homeinfo")
	public String gethomeinfo() {
		return "api is fine";
	}
	
	
	@PostMapping("/additem")
	public ResponseEntity addItem(@RequestBody Item item) {
		dao.save(item);
		return new ResponseEntity("item added successfully", HttpStatus.OK);
	}
	
	@GetMapping("/getallitems")
	public List<Item> getallitems(){
		return dao.findAll();
	}
	
	@PatchMapping("/updateitem")
	public ResponseEntity updateItem(@RequestBody Item item) {
		dao.save(item);
		return new ResponseEntity("updated!", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteitem")
	public ResponseEntity deleteItem(@RequestBody Item item) {
		dao.delete(item);
		return new ResponseEntity("deleted!", HttpStatus.OK);
	}
	
	@GetMapping("/findbyid/{id}")
	public Item getitem(@PathVariable int id) {
		return dao.findById(id).get();
	}
	
	@GetMapping("/findbyprice/{price}")
	public Item getitembyprice(@PathVariable float price) {
		return dao.findByPrice(price).get(0);
	}
	
}
