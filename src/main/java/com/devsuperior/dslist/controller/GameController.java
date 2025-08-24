package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.dto.GameMinDTO;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService; // Injetando service no controller

    @GetMapping
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> resultado = gameService.findAll();

        return resultado;
    }

}
