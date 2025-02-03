package com.devmicheletto.dslist.repositories;

import com.devmicheletto.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
