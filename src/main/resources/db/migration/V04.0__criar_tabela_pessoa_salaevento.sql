CREATE TABLE pessoa_salaevento(
  pessoa_id int,
  salaevento_id int,
  CONSTRAINT fkpessoa FOREIGN KEY (pessoa_id) REFERENCES pessoa(id),
    CONSTRAINT fksala FOREIGN KEY (salaevento_id) REFERENCES salaevento(id)
);
