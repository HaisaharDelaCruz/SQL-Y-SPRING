Esta es la prueba técnica de SQL Y Spring Boot.

Dentro del proyecto estará la imagen del modelo entidad-relación y a continuación estarán las consultas de la actividad 1.

▪Escribe la consulta SQL que recupere todos los podcasts vigentes quetengan más de un episodio
select p.* 
from podcast p
JOIN episodio e ON e.PodcastId = p.id
where p.Fecha_Expiracion > GETDATE()
GROUP BY p.id, p.Nombre_Podcast, p.descripcion, p.Fecha_Publicacion, p.Fecha_Expiracion, p.portadaurl, p.generourl
HAVING COUNT(e.id) > 1;

▪ Escribe la consulta que recupere todos los episodios de un podcast ordenados por el más reciente
select * from episodio
Order By Fecha_Publicacion DESC;

▪ Escribe la consulta que recupere el podcast con más idiomas disponibles
SELECT TOP 1 p.*, COUNT(pi.PodcastId) AS total_idiomas
FROM podcast p
JOIN Podcast_Idioma pi ON pi.PodcastId = p.id
GROUP BY p.id, p.Nombre_Podcast, p.descripcion, p.Fecha_Publicacion, p.Fecha_Expiracion, p.portadaurl, p.generourl
ORDER BY total_idiomas DESC;

En la activiadad 2 se realizo usando el IDE Visual Studio Code, el esquema de la base de datos así como los datos necesarios estarán dentro de la carpeta:
src|main|resource

lo unico que se necesita para que funcionen estos archivos es ejecutando la aplicación. Al ejecutarla para visualizar si todo esta correctamente se entrara a la siguente dirección:
http://localhost:8080/h2-console/

despues se configurará el siguiente apartado para que pueda funcionar H2
JDBC URL: jdbc:h2:mem:podcastdb

al entrar a la bd ya estará cargado el esquema y los datos debidamente insertados.
