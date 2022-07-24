/**
 * 
 */
package com.maplr.testhockeygame.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 * @author mabeida
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PLAYER") 
public class Player {
	
	
	    @Id
	    @Column(name = "player_number") 
	    private Long number;
	    
	    @Column  
	    private String name;
	    
	    @Column  
	    private String lastname;
	    
	    @Column  
	    private String position;
	    
	    @Column  
	    private Boolean isCaptain;
	    
	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    @JoinColumn(name = "team_id", nullable = true)
	    @JsonIgnore
	    private Team team;
	
}
