CREATE TABLE musicas_autores (
  id_artista INT NOT NULL,
  id_musica INT NOT NULL,
  PRIMARY KEY (id_artista, id_musica),
  foreign key(id_artista) references artistas(id),
  foreign key(id_musica) references musicas(id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO musicas_autores (id_artista, id_musica)
VALUES (1, 1);
INSERT INTO musicas_autores (id_artista, id_musica)
VALUES (2, 2);
