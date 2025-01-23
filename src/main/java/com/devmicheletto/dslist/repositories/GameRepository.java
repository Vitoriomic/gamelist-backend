package com.devmicheletto.dslist.repositories;

import com.devmicheletto.dslist.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
