package com.devmicheletto.dslist.controllers;


import com.devmicheletto.dslist.dto.GameListDTO;
import com.devmicheletto.dslist.dto.GameMinDTO;
import com.devmicheletto.dslist.dto.ReplacementDTO;
import com.devmicheletto.dslist.services.GameListService;
import com.devmicheletto.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/games")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(),body.getDestinationIndex());
    }
}
