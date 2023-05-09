package br.com.dsgame.services;

import br.com.dsgame.dto.GameMinDTO;
import br.com.dsgame.entities.Game;
import br.com.dsgame.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;




    public List<GameMinDTO> findAll() {
        //List<Game> result = gameRepository.findAll(); Outra possibilidade de retorna a lista de Game
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
