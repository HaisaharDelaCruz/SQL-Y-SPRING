INSERT INTO Idiomas (Id, Idioma) VALUES (1, 'Español');
INSERT INTO Idiomas (Id, Idioma) VALUES (2, 'Ingles');
INSERT INTO Idiomas (Id, Idioma) VALUES (3, 'Frances');

INSERT INTO Podcast (Nombre_Podcast, Descripcion, Fecha_Publicacion, Fecha_Expiracion, PortadaURL, GeneroURL) 
VALUES ('Radio Paini', 'Podcast de Paini donde entrevista a figuras destacadas de la música.', '2021-01-10', '2026-01-10', 'https://servidor.com/images/RadioPaini-tema.jpg', 'https://servidor.com/generos/desarrollo-personal');

INSERT INTO Podcast (Nombre_Podcast, Descripcion, Fecha_Publicacion, Fecha_Expiracion, PortadaURL, GeneroURL) 
VALUES ('Adultos Raros', 'Podcast de Gaston donde entrevista a figuras destacadas de la música.', '2022-01-10', '2023-01-10', 'https://servidor.com/images/Gaston-tema.jpg', 'https://servidor.com/generos/desarrollo-personal');

INSERT INTO Podcast (Nombre_Podcast, Descripcion, Fecha_Publicacion, Fecha_Expiracion, PortadaURL, GeneroURL) 
VALUES ('Doble G', 'Podcast de Gusgri donde entrevista a figuras destacadas de las redes sociales.', '2025-01-10', '2031-01-10', 'https://servidor.com/images/DobleG-tema.jpg', 'https://servidor.com/generos/desarrollo-personal');

INSERT INTO Podcast_Idioma (IdiomaId, PodcastId) VALUES (1, 1);
INSERT INTO Podcast_Idioma (IdiomaId, PodcastId) VALUES (2, 1);
INSERT INTO Podcast_Idioma (IdiomaId, PodcastId) VALUES (3, 1);

INSERT INTO Episodio (PodcastId, Nombre_Episodio, Fecha_Publicacion, Duracion, AudioURL, ImagenURL) 
VALUES (1, 'Entrevista con Leon Larregui', '2021-02-10', 45.50, 'https://servidor.com/audios/leonlarregui.mp3', 'https://servidor.com/images/episodio-leon.jpg');

INSERT INTO Episodio (PodcastId, Nombre_Episodio, Fecha_Publicacion, Duracion, AudioURL, ImagenURL) 
VALUES (1, 'La historia de Café Tacvba', '2021-03-15', 40, 'https://servidor.com/audios/cafetacvba.mp3', 'https://servidor.com/images/episodio-cafe.jpg');

INSERT INTO Episodio (PodcastId, Nombre_Episodio, Fecha_Publicacion, Duracion, AudioURL, ImagenURL) 
VALUES (2, 'Conversación con Mon Laferte', '2022-02-10', 50, 'https://servidor.com/audios/monlaferte.mp3', 'https://servidor.com/images/episodio-mon.jpg');

INSERT INTO Episodio (PodcastId, Nombre_Episodio, Fecha_Publicacion, Duracion, AudioURL, ImagenURL) 
VALUES (2, 'Los retos de la música indie', '2022-03-01', 38.45, 'https://servidor.com/audios/musica-indie.mp3', 'https://servidor.com/images/episodio-indie.jpg');

INSERT INTO Episodio (PodcastId, Nombre_Episodio, Fecha_Publicacion, Duracion, AudioURL, ImagenURL) 
VALUES (3, 'Influencers y autenticidad', '2025-02-20', 60, 'https://servidor.com/audios/influencers.mp3', 'https://servidor.com/images/episodio-influencers.jpg');

INSERT INTO Episodio (PodcastId, Nombre_Episodio, Fecha_Publicacion, Duracion, AudioURL, ImagenURL) 
VALUES (3, 'La evolución del contenido digital', '2025-03-15', 42, 'https://servidor.com/audios/contenido-digital.mp3', 'https://servidor.com/images/episodio-digital.jpg');

