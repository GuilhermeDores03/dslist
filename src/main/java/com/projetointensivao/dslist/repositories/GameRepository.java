package com.projetointensivao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointensivao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
