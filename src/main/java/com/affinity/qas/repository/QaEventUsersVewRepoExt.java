package com.affinity.qas.repository; 

		
 
import org.springframework.data.jpa.repository.JpaRepository;		
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import java.util.List;
import	com.affinity.qas.domain.QaEventUsersVew; 

@Repository
//@RepositoryRestResource

 
public interface QaEventUsersVewRepoExt extends JpaRepository<QaEventUsersVew, Integer> {
	
	public List<QaEventUsersVew> findByEventId(Integer eventId);
	
}

  
