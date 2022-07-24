package com.maplr.testhockeygame.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.maplr.testhockeygame.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>   {

	
	 @Query("SELECT t FROM Team t WHERE t.year = ?1")
	 Team findByYear(@Param("year") long year);
}
