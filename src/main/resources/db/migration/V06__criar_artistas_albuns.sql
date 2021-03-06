CREATE TABLE artistas_albuns (
  id_artista INT NOT NULL,
  id_album INT NOT NULL,
  PRIMARY KEY (id_artista, id_album),
  foreign key(id_artista) references artistas(id),
  foreign key(id_album) references albuns(id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO artistas_albuns (id_artista, id_album)
VALUES (1, 1);
INSERT INTO artistas_albuns (id_artista, id_album)
VALUES (2, 2);