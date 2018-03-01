package com.affinity.awas.security.repository; 

		
 
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import	com.affinity.awas.security.entity.UtlUserProcesses; 

@Repository
//@RepositoryRestResource

 
public interface UtlUserProcessesRepo extends CrudRepository<UtlUserProcesses, Integer> {
	
}

  
