package com.example.ss.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ss.entity.ProductEntity;

@Service
public class ProductService implements IProductService{
	@Override
	public List<ProductEntity> findAll()  
	{  
		//Create an ArrayList of ProductEntity	
		ArrayList<ProductEntity> products = new ArrayList<ProductEntity>();
		
		products.add(new ProductEntity(100,"Laptop",50000));
		products.add(new ProductEntity(101,"Mobile",15000));
		products.add(new ProductEntity(102,"TAB",20000));
		products.add(new ProductEntity(103,"Washing Machine",25000));
		products.add(new ProductEntity(104,"Fridge",18000));
		products.add(new ProductEntity(105,"Air Conditioner",35000));
		return(products);
	}
	@Override
	public List<ProductEntity> delete(int id, List<ProductEntity> productEntity){
		ProductEntity p= new ProductEntity();
		for(int i=0;i<productEntity.size();i++) {
			p=productEntity.get(i);
			if(p.getPid()==id) {
				productEntity.remove(i);
			}
		}
		return productEntity;
	}
	
	@Override
	public List<ProductEntity> insert(int id, String name, double pri, List<ProductEntity> productEntity) {
		ProductEntity p = new ProductEntity(id,name,pri);
		
		productEntity.add(p);
		
		return productEntity;
	}
	@Override
	public List<ProductEntity> update(ProductEntity pe, List<ProductEntity> products) {
		ProductEntity p = new ProductEntity();
		boolean flag=false;
		for(int i=0;i<products.size();i++) {
			p=products.get(i);
			if(p.getPid()==pe.getPid()) {
				p.setPname(pe.getPname());
				p.setPrice(pe.getPrice());
				flag=true;
				break;
			}
		}
		if(flag==false) {
			products.add(pe);
		}
		
		
		return products;
	}
	
}
