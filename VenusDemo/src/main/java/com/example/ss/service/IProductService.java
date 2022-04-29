package com.example.ss.service;

import java.util.List;

import com.example.ss.entity.ProductEntity;

public interface IProductService {
	List<ProductEntity> findAll();  
	List<ProductEntity> update(ProductEntity pe, List<ProductEntity> productEntity );
	List<ProductEntity> insert(int id, String name, double pri, List<ProductEntity> productEntity);
	List<ProductEntity> delete(int id, List<ProductEntity> productEntity);
}
