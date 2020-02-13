CREATE TABLE artistas (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  nacionalidade VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO artistas (nome, nacionalidade)
VALUES ("M. Shadows", "Americano");
INSERT INTO artistas (nome, nacionalidade)
VALUES ("Adam Gontier", "Americano");