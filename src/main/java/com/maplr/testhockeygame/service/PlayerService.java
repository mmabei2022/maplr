package com.maplr.testhockeygame.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.maplr.testhockeygame.model.Player;
import com.maplr.testhockeygame.model.Team;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.repository.TeamRepository;  

/**
 * @author mabeida
 *
 */
@Service  
public class PlayerService {

	@Autowired  
	PlayerRepository playerRepository;  
	
	@Autowired 
	TeamRepository teamRepository;  


	
	
	public Player getPlayerById(long number)   
	{  
	return playerRepository.findById(number).get();  
	}  


	public void save(Player player, long year)   
	{  
		Team team = teamRepository.findByYear(year);
		player.setTeam(team);

        team.getPlayers().add(player);
        teamRepository.save(team);
        
		
	}  


	public Player update(Long number)   
	{  
		Optional<Player> player = playerRepository.findById(number);
		player.get().setIsCaptain(true);
		return playerRepository.save(player.get());  
	}  
}
