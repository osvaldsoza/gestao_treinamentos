CREATE TABLE pessoa_espacocafe(
  pessoa_id int,
  espacocafe_id int,
    CONSTRAINT fkpessoa FOREIGN KEY (pessoa_id) REFERENCES pessoa(id),
    CONSTRAINT fkespacocafe FOREIGN KEY (espacocafe_id) REFERENCES espacocafe(id)
);

