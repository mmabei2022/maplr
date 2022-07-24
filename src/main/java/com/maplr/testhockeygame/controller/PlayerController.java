/**
 * 
 */
package com.maplr.testhockeygame.controller;

/**
 * @author mabeida
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maplr.testhockeygame.model.Player;
import com.maplr.testhockeygame.service.PlayerService;
import com.maplr.testhockeygame.service.TeamService;  


@RestController
public class PlayerController {

	@Autowired  
	PlayerService playerService;  
	
	@Autowired
	TeamService teamService;
	

	@PostMapping("api/team/{year}")
    public ResponseEntity<String> savePlayer(@RequestBody Player player, @PathVariable long year)   
	{  
	
		try {

            playerService.save(player, year);
           return new ResponseEntity<>("Player saved successfully..", HttpStatus.CREATED);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>("Error in saving Player ..", HttpStatus.BAD_REQUEST);
        }  
	}  
	 
	@PutMapping("/api/player/captain/{number}")  
	public ResponseEntity<String> update(@PathVariable long number)   
	{  
		try {
		playerService.update(number);
		return new ResponseEntity<>("Player updated successfully..", HttpStatus.OK);
		}catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>("Error in updating Player ..", HttpStatus.BAD_REQUEST);
        }
	 
	}  
}
