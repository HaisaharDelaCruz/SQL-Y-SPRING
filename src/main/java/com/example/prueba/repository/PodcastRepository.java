package com.example.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.models.Podcast;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Long>{

}
