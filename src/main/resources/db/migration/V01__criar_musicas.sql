CREATE TABLE musicas (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  duracao INT NOT NULL,
  PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO musicas (nome, duracao)
VALUES ("Deargod", 5);
INSERT INTO musicas (nome, duracao)
VALUES ("World so cold", 5);
INSERT INTO musicas (nome, duracao)
VALUES ("Nightmare", 6);