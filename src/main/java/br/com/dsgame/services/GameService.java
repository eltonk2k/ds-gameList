package br.com.dsgame.services;

import br.com.dsgame.dto.GameDTO;
import br.com.dsgame.dto.GameMinDTO;
import br.com.dsgame.entities.Game;
import br.com.dsgame.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;



    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game resultGame = gameRepository.findById(id).get();
        return new GameDTO(resultGame);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        //List<Game> result = gameRepository.findAll(); Outra possibilidade de retorna a lista de Game
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
