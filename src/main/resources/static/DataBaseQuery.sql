
/**
 * Author:  irina
 * Created: 28 oct. 2023
 */

CREATE DATABASE IF NOT EXISTS bd_cartelera;

INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('152', 'Harry Potter y la piedra filosofal');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('161', 'Harry Potter y la cámara secreta');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('139', 'Harry Potter y el prisionero de Azkaban');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('157', 'Harry Potter y el cáliz de fuego');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('138', 'Harry Potter y la orden del Fénix');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('153', 'Harry Potter y el misterio del príncipe');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('146', 'Harry Potter y las reliquias de la muerte - Parte 1');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('130', 'Harry Potter y las reliquias de la muerte - Parte 2');

INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 1');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 2');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 33');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 27');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala Premium');


INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2025-10-11', '2023-10-28', '1', '1');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-12-16', '2023-10-28', '2', '1');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-01-05', '2023-10-28', '3', '2');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2025-01-10', '2023-10-28', '4', '2');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2025-01-15', '2023-10-28', '5', '2');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2025-01-16', '2023-10-28', '6', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-01-15', '2023-10-28', '7', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-01-06', '2023-10-28', '1', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-01-07', '2023-10-28', '2', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-01-08', '2023-10-28', '3', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id_pelicula`, `sala_cine_id_sala`) VALUES ('2024-01-09', '2023-10-28', '4', '3');

