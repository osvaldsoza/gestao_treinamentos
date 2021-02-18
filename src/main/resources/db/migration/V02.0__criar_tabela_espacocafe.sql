CREATE TABLE espacocafe(
	id serial primary key,
	nome varchar(50) not NULL,
	lotacao int NOT NULL,
	idPessoa int NOT NULL,
	CONSTRAINT fkidpessoa FOREIGN KEY (idPessoa) REFERENCES pessoa(id)
);

INSERT INTO espacocafe(nome,lotacao,idPessoa) VALUES ('Espaco 1',20,2);
INSERT INTO espacocafe(nome,lotacao,idPessoa) VALUES ('Espaco 2',10,3);
INSERT INTO espacocafe(nome,lotacao,idPessoa) VALUES ('Espaco 3',15,1);
INSERT INTO espacocafe(nome,lotacao,idPessoa) VALUES ('Espaco 3',15,3);