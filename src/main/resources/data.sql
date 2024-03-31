-- Inserir dados de amostra na tabela Livro

INSERT INTO Livro (id, titulo, autor, anoPublicacao)
VALUES (1, 'Memorial do Convento', 'José Saramago', 1982),
       (2, 'A Hora da Estrela', 'Clarice Lispector', 1977),
       (3, 'Assim Falou Zaratustra', 'Friedrich Nietzsche',1883);

-- Inserir dados de amostra na tabela Membros

INSERT INTO Membros (id, nome, endereco, telefone)
VALUES (1, 'Pedro', 'Rua 45','225558866'),
       (2,'Daniel', 'Rua 25', '5599887744');

-- Inserir dados de amostra na tabela Empréstimos

INSERT INTO Emprestimos (id, livro_id, membro_id, data_emprestimo, data_devolucao)
VALUES (1, 1, 1, '2024-01-15', '2024-03-15'),
       (2, 2, 2, '2024-02-16', '2024-03-15');

-- Inserir dados de amostra na tabela Bibliotecario

INSERT INTO Bibliotecario (id, nome, email, senha)
VALUES (1, 'Davi', 'davi@exemplo.com', 'senha123'),
       (2, 'Artur', 'artur@exemplo.com', 'senha321');

INSERT INTO Visitante (id, nome, telefone)
VALUES (1, 'Rodrigo', '4455887799'),
       (2, 'Ricardo', '223366997700');