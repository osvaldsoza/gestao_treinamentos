CREATE TABLE salaevento(
	id serial primary key,
	nome varchar(50) not NULL,
	lotacao int NOT NULL
);

INSERT INTO salaevento (nome, lotacao) VALUES ('Star Wars', 23);
INSERT INTO salaevento (nome, lotacao) VALUES ('Avengers', 20);