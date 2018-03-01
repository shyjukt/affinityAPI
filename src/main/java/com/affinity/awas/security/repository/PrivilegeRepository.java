 
package com.affinity.awas.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.affinity.awas.security.entity.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

	Privilege findByName(String name);
	
}
