package com.example.prueba.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Episodio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombre_Episodio;
    private Date fecha_Publicacion;
    private float duracion;

    private String audioURL;
    private String imagenURL;

    @ManyToOne
    private Podcast Podcast;

    @ManyToMany
    private List<Idiomas> Idiomas;

	public String getNombreEpisodio() {
		return this.nombre_Episodio;
	}

	public void setNombreEpisodio(String NombreEpisodio) {
		this.nombre_Episodio = NombreEpisodio;
	}

	public Date getFechaPublicacion() {
		return this.fecha_Publicacion;
	}

	public void setFechaPublicacion(Date FechaPublicacion) {
		this.fecha_Publicacion = FechaPublicacion;
	}

	public float getDuracion() {
		return this.duracion;
	}

	public void setDuracion(float Duracion) {
		this.duracion = Duracion;
	}

	public String getAudioURL() {
		return this.audioURL;
	}

	public void setAudioURL(String AudioURL) {
		this.audioURL = AudioURL;
	}

	public String getImagenURL() {
		return this.imagenURL;
	}

	public void setImagenURL(String ImagenURL) {
		this.imagenURL = ImagenURL;
	}
}
