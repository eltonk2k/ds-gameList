package br.com.dsgame.controllers;

import br.com.dsgame.dto.GameDTO;
import br.com.dsgame.dto.GameListDTO;
import br.com.dsgame.dto.GameMinDTO;
import br.com.dsgame.dto.ReplacementDTO;
import br.com.dsgame.services.GameListService;
import br.com.dsgame.services.GameService;
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

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
