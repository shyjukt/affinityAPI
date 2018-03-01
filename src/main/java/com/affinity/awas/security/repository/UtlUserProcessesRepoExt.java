package com.affinity.awas.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.affinity.awas.security.entity.UtlUserProcesses;

public interface UtlUserProcessesRepoExt extends 
JpaRepository<UtlUserProcesses, Integer> {

	  @Query("SELECT distinct t FROM UtlUserProcesses t where PERS_CODE= :persCode")
	    public List<UtlUserProcesses> findByPersCode(@Param("persCode") Integer persCode 
	  );

}
