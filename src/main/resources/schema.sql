
DROP TABLE IF EXISTS Podcast_Idioma;
DROP TABLE IF EXISTS Episodio;
DROP TABLE IF EXISTS Podcast;
DROP TABLE IF EXISTS Idiomas;

CREATE TABLE Podcast (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Nombre_Podcast VARCHAR(100),
    Descripcion VARCHAR(255),
    Fecha_Publicacion DATE,
    Fecha_Expiracion DATE,
    PortadaURL VARCHAR(255),
    GeneroURL VARCHAR(255)
);

CREATE TABLE Episodio (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PodcastId INT NOT NULL,
    Nombre_Episodio VARCHAR(100),
    Fecha_Publicacion DATE,
    Duracion DOUBLE,
    AudioURL VARCHAR(255),
    ImagenURL VARCHAR(255),
    FOREIGN KEY (PodcastId) REFERENCES Podcast(Id)
);

CREATE TABLE Idiomas (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Idioma VARCHAR(50)
);

CREATE TABLE Podcast_Idioma (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    IdiomaId INT,
    PodcastId INT,
    FOREIGN KEY (IdiomaId) REFERENCES Idiomas(Id),
    FOREIGN KEY (PodcastId) REFERENCES Podcast(Id)
);
