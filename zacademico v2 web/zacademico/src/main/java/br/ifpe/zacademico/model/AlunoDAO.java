package br.ifpe.zacademico.model;

import org.springframework.jdbc.core.simple.JdbcClient;

import br.ifpe.zacademico.model.Aluno;

public class AlunoDAO {
    
    private final JdbcClient JdbcClient;


    public AlunoDAO(JdbcClient JdbcClient) {
        this.JdbcClient = JdbcClient;
    }

    public Integer create(Aluno aluno){
        return JdbcClient.sql("insert into aluno(nome, cpf, idade, email_pessoal, email_institucional, senha, matricula) values (:nome, :cpf, :idade, :email_pessoal, :email_institucional, :senha, :matricula)").param("nome",aluno.getNome()).param("cpf",aluno.getCpf()).param("idade",aluno.getIdade()).param("email_pessoal",aluno.getEmailPessoal()).param("email_institucional",aluno.getEmailInstitucional()).param("senha",aluno.getSenha()).param("matricula",aluno.getMatricula()).update();
    };
}