create database zacademico;

use zacademico;

CREATE TABLE aluno (
  id int NOT NULL AUTO_INCREMENT,
  nome varchar(50) DEFAULT NULL,
  cpf varchar(11) DEFAULT NULL,
  idade int DEFAULT NULL,
  email_pessoal varchar(50) DEFAULT NULL,
  email_institucional varchar(50) DEFAULT NULL,
  senha varchar(50) DEFAULT NULL,
  matricula varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY cpf (cpf)
) ;

select * from aluno;
