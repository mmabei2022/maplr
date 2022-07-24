/**
 * 
 */
package com.maplr.testhockeygame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maplr.testhockeygame.model.Team;
import com.maplr.testhockeygame.service.TeamService;

/**
 * @author mabeida
 *
 */

@RestController
public class TeamController {

	@Autowired  
	TeamService teamService;  
	
	@GetMapping("/api/team/{year}")  
	private Team findTeamByYear(@PathVariable Long year)   
	{  
	return teamService.findByYear(year);  
	}  
	  

	@PostMapping("/api/team")  
	private ResponseEntity<String> saveTeam(@RequestBody Team team)   
	{  
		try{ 
			teamService.save(team);  
			return new ResponseEntity<>("Team saved successfully..", HttpStatus.CREATED);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>("Error in saving Team ..", HttpStatus.BAD_REQUEST);
        }  
	}  
}
