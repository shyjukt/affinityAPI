 
package com.affinity.awas.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.affinity.awas.security.entity.User;


public interface UserRepository extends JpaRepository<User, Long>
{

	@Query("select t FROM User t where user_name = :userName" )
	public User findByUserName(@Param("userName") String userName) ;
	//throws DataAccessException;
	 	 

}
