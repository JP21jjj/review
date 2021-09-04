package com.projetoceos.review.controller;

import java.util.List;

import com.projetoceos.review.dto.GameDTO;
import com.projetoceos.review.dto.GamesResultDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GamesController {
    
    @GetMapping("/games")
    public List<GamesResultDTO> searchGames(@RequestParam String search){
        return null;
    }

    @GetMapping("/games/{Id}")
    public List<GameDTO> getGame(@PathVariable String id){
        return null;
    }

}
