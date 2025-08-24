package com.devsuperior.dslist.service;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.dto.GameMinDTO;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired //GameRepository é um componente do sistemas
    private GameRepository gameRepository; // Injetando uma instancia do GameRepository dentro do GameService

    public List<GameMinDTO> findAll() {

       List<Game>  resultado = gameRepository.findAll();
       List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();

       return dto;
    }

}
