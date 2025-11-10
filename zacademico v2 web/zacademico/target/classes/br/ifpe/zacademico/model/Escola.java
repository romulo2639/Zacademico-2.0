package br.ifpe.zacademico.model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
   private String idMec;
   private String nome;
   private String cnpj;
   private String tipo;
   private String localidade;
   private List<Aluno> alunos;

   public Escola(String idMec, String nome, String cnpj, String tipo, String localidade) {
      this.idMec = idMec;
      this.nome = nome;
      this.cnpj = cnpj;
      this.tipo = tipo;
      this.localidade = localidade;
      this.alunos = new ArrayList();
   }

   public String getIdMec() {
      return this.idMec;
   }

   public void setIdMec(String idMec) {
      this.idMec = idMec;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getCnpj() {
      return this.cnpj;
   }

   public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
   }

   public String getTipo() {
      return this.tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getLocalidade() {
      return this.localidade;
   }

   public void setLocalidade(String localidade) {
      this.localidade = localidade;
   }

   public List<Aluno> getAlunos() {
      return this.alunos;
   }

   public void setAlunos(List<Aluno> alunos) {
      this.alunos = alunos;
   }
}