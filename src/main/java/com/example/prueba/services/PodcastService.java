package com.example.prueba.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prueba.dtos.PodcastDTO;
import com.example.prueba.models.Podcast;
import com.example.prueba.repository.PodcastRepository;

@Service
public class PodcastService {

    private final PodcastRepository podcastRepository;

    public PodcastService(PodcastRepository podcastRepository){
        this.podcastRepository = podcastRepository;
    }

    public List<Podcast> obtenerTodos(){
        return podcastRepository.findAll();
    }

    public Podcast obtenerPodcastId(Long id){
        return podcastRepository.findById(id).orElse(null);
    }

    public Podcast guarPodcast(PodcastDTO dto){
       Podcast p = new Podcast();
       p.setNombre_Podcast(dto.nombre);
       p.setDescripcion(dto.descripcion);
       p.setFecha_Publicacion(dto.fechaPublicacion);
       p.setFecha_Expiracion(dto.fechaExpiracion);
       p.setPortadaURL(dto.portadaURL);
       p.setGeneroURL(dto.generoURL);
       return podcastRepository.save(p);
    }

}
