package com.coforge.training.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.ims.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	    //Long is data type of id field of Product class
		/*
	     * This interface has save(),findAll(),findById(),deleteById(),count()
	       etc.. inbuilt methods of jpa repository for various database operations.
	       This interface will be implemented by class automatically
	    */
	  
	  //Custom finder methods.The implementation is plugged in by Spring Data JPA automatically. 
	  List<Product> findByMadein(String country); 
}
