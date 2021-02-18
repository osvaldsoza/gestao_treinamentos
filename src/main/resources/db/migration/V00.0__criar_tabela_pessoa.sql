CREATE TABLE pessoa(
	id serial primary key,
	nome varchar(50) not NULL
);

INSERT INTO pessoa(nome) VALUES ('Fulano');
INSERT INTO pessoa(nome) VALUES ('Ciclano');
INSERT INTO pessoa(nome) VALUES ('Beltrano');