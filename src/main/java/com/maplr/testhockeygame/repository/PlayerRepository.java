package com.maplr.testhockeygame.repository;

import org.springframework.data.repository.CrudRepository;

import com.maplr.testhockeygame.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>   {

}
