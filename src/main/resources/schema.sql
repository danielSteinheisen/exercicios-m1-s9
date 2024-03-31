-- Criar tabela Livro

CREATE TABLE Livro
(
    id INT PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    anoPublicacao INT
);

-- Criar tabela Membros

CREATE TABLE Emprestimos
(
    id INT PRIMARY KEY,
    livro_id INT,
    membro_id INT,
    dataEmprestimo DATE,
    dataDevolucao DATE,
    FOREIGN KEY (livro_id) REFERENCES Livro (id),
    FOREIGN KEY (membro_id) REFERENCES Membros (id)
);

--  Criar tabela Bibliotecario

CREATE TABLE Bibliotecario
(
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255)
);

--  Criar tabela Visitante

CREATE TABLE Visitante
(
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    telefone VARCHAR(20)
);