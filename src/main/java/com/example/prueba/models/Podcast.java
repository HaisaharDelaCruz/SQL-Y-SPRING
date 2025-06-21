package com.example.prueba.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombre_Podcast;
    private String descripcion;

    private Date fecha_Publicacion;
    private Date fecha_Expiracion;

    private String portadaURL;
    private String generoURL;

	public String getNombre_Podcast() {
		return this.nombre_Podcast;
	}

	public void setNombre_Podcast(String nombre_Podcast) {
		this.nombre_Podcast = nombre_Podcast;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_Publicacion() {
		return this.fecha_Publicacion;
	}

	public void setFecha_Publicacion(Date fecha_Publicacion) {
		this.fecha_Publicacion = fecha_Publicacion;
	}

	public Date getFecha_Expiracion() {
		return this.fecha_Expiracion;
	}

	public void setFecha_Expiracion(Date fecha_Expiracion) {
		this.fecha_Expiracion = fecha_Expiracion;
	}

	public String getPortadaURL() {
		return this.portadaURL;
	}

	public void setPortadaURL(String portadaURL) {
		this.portadaURL = portadaURL;
	}

	public String getGeneroURL() {
		return this.generoURL;
	}

	public void setGeneroURL(String generoURL) {
		this.generoURL = generoURL;
	}


    @OneToMany(mappedBy = "Podcast")
    private List<Episodio> Episodios;

    @ManyToMany
    private List<Idiomas> Idiomas;

	
}