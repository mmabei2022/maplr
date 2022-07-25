package com.maplr.testhockeygame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maplr.testhockeygame.model.Team;
import com.maplr.testhockeygame.repository.TeamRepository;

/**
 * @author mabeida
 *
 */
@Service
public class TeamService {

	
	@Autowired  
	TeamRepository teamRepository;  
	 
//	public Team findTeamById(final Long id)   
//	{  
//	return teamRepository.findById(id).get();  
//	}  
	
	public void save(final Team team)   
	{  
		teamRepository.save(team);  
	}  
	
	
	
	public void update(final Team team, Long id)   
	{  
		teamRepository.save(team);  
	}
	public Team findByYear(final Long year) {
		return teamRepository.findByYear(year);
	}  
}
