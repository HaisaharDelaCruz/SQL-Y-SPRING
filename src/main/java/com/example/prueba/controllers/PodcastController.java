package com.example.prueba.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.dtos.PodcastDTO;
import com.example.prueba.models.Podcast;
import com.example.prueba.services.PodcastService;

@RestController
@RequestMapping("/api")
public class PodcastController {
    private final PodcastService podcastService;

    public PodcastController(PodcastService podcastService){
        this.podcastService = podcastService;
    }

    @GetMapping("/getPodcasts")
    public List<Podcast> obtenerPodcast(){
        return podcastService.obtenerTodos();
    }

    @GetMapping("/getPodcastById/{id}")
    public Podcast obtenerPodcastById(@PathVariable Long id){
        return podcastService.obtenerPodcastId(id);
    }

    @PostMapping("/addPodcast")    
    public Podcast añadirPodcast(@RequestBody PodcastDTO dto){
        Podcast nuevo = podcastService.guarPodcast(dto);
        return nuevo;
    }


}
