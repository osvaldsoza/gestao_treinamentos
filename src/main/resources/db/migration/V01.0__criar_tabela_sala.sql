CREATE TABLE salaevento(
	id serial primary key,
	nome varchar(50) not NULL,
	lotacao int NOT NULL,
		idPessoa int NOT NULL,
	CONSTRAINT fkidpessoa FOREIGN KEY (idPessoa) REFERENCES pessoa(id)
);

INSERT INTO salaevento(nome,lotacao,idPessoa) VALUES ('Sala 1',20,1);
INSERT INTO salaevento(nome,lotacao,idPessoa) VALUES ('Sala 2',10,1);
INSERT INTO salaevento(nome,lotacao,idPessoa) VALUES ('Sala 3',15,2);
INSERT INTO salaevento(nome,lotacao,idPessoa) VALUES ('Sala 1',20,3);