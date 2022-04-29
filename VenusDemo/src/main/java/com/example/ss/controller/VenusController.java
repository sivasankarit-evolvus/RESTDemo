package com.example.ss.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ss.entity.ProductEntity;
import com.example.ss.service.IProductService;

@RestController
public class VenusController {
	@Autowired  
	private IProductService productService;  

	@GetMapping(value = "/getProduct")  
	public List<ProductEntity> getProduct()   
	{  
	//Finds the Product List
	List<ProductEntity> products = productService.findAll();

	return products;  
	}  
	
	@GetMapping(value = "/getProduct/{index}")  
	public ProductEntity getProduct(@PathVariable int index)   
	{  
	//Finds the Product List
		List<ProductEntity> products = productService.findAll();
	
		return (products.get(index));
	 
	}  
	
	
	@DeleteMapping(value = "/deleteProduct/{id}")
	public List<ProductEntity> deleteProduct(@PathVariable int id){
		
		List<ProductEntity> products = productService.findAll();
		products = productService.delete(id,products);
		
		return products;
		//return ResponseEntity.ok(products);
		
	}
	
	
	@PutMapping(value = "/putProduct/{id}/{name}/{price}")
	public List<ProductEntity> putProduct(@PathVariable int id, @PathVariable String name,@PathVariable double price)   
	{  
	//Finds the Product List
	List<ProductEntity> products = productService.findAll();
	products = productService.insert(id, name, price, products);
	return products; 
	}  
	
	@PostMapping(value="/postProduct")
	public List<ProductEntity> postProduct(@RequestBody ProductEntity productEntity){
		List<ProductEntity> products = productService.findAll();
		products = productService.update(productEntity, products);
		return products;
	}
 }

