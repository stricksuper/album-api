CREATE TABLE albuns(
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  ano INT NOT NULL,
  PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO albuns (nome, ano)
VALUES ("Avegend Sevenfold", 2007);
INSERT INTO albuns (nome, ano)
VALUES ("Life Starts Now", 2009);
