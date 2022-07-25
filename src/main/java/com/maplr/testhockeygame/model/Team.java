package com.maplr.testhockeygame.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@Table(name="TEAM")
@JsonIdentityInfo(
	       generator = ObjectIdGenerators.PropertyGenerator.class,
	       property = "id")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "team_id")
    private Long id;
	
	@Column
	private String coach;
	
	 @Column  
	 private long year;
	 
	 
	 @OneToMany(cascade=CascadeType.ALL)
	   @JoinColumn(name = "team_id")
	 private Set<Player> players;
}
