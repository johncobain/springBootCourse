CREATE TABLE produto (
    id varchar(255) NOT NULL PRIMARY KEY,
    nome varchar(50) NOT NULL,
    descricao varchar(300) NOT NULL,
    preco numeric(18, 2) NOT NULL
);