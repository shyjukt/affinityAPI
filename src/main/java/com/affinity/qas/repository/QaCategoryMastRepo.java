package com.affinity.qas.repository; 

		
 
import org.springframework.data.jpa.repository.JpaRepository;		
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import	com.affinity.qas.domain.QaCategoryMast; 

@Repository
//@RepositoryRestResource

 
public interface QaCategoryMastRepo extends JpaRepository<QaCategoryMast, Integer> {
	
}

  
