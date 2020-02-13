CREATE TABLE musicas_interpretes (
  id_artista INT NOT NULL,
  id_musica INT NOT NULL,
  PRIMARY KEY (id_artista, id_musica),
  foreign key(id_artista) references artistas(id),
  foreign key(id_musica) references musicas(id)
) engine=InnoDB DEFAULT CHARSET=utf8;