INSERT INTO USUARIO(nome, email, senha) VALUES ('Aluno', 'aluno@email.com', '123456');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)
VALUES('Dúvida', 'Erro ao criar projeto', '2022-09-21', '', 1, 1);
