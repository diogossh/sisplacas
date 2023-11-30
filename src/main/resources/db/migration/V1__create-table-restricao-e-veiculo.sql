CREATE table restricao(
    id int not null PRIMARY key AUTO_INCREMENT,
    nome varchar(40)

    );

CREATE TABLE veiculo(
    id int not null PRIMARY key AUTO_INCREMENT,
    nome varchar(30) not null,
    cor varchar(20),
    marca varchar(30),
    placa varchar(20),
    id_restricao int,
    FOREIGN KEY(id_restricao) REFERENCES restricao(id)

    );