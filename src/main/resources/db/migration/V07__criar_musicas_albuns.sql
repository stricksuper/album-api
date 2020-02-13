  
CREATE TABLE musicas_albuns (
  id_album INT NOT NULL,
  id_musica INT NOT NULL,
  PRIMARY KEY (id_musica, id_album),
  foreign key(id_musica) references musicas(id),
  foreign key(id_album) references albuns(id)
) engine=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO musicas_albuns (id_album, id_musica)
VALUES (1, 1);
INSERT INTO musicas_albuns (id_album, id_musica)
VALUES (2, 2);