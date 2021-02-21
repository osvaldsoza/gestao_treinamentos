CREATE TABLE espacocafe(
	id serial primary key,
	nome varchar(50) not NULL,
	lotacao int NOT NULL
);

INSERT INTO espacocafe (nome, lotacao) VALUES ('Madalorian' , 10);