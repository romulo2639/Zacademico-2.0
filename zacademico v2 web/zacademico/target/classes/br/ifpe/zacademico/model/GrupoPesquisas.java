package br.ifpe.zacademico.model;

import java.util.Date;
import java.util.List;

public class GrupoPesquisas {
   private String identificadorCNPQ;
   private String nome;
   private String descricao;
   private String tema;
   private String area;
   private Professor professorLider;
   private Date dataCriacao;
   private Date dataExpiracao;
   private List<Professor> ProfessoresMembros;

   public GrupoPesquisas(String identificadorCNPQ, String nome, String descricao, String tema, String area, Professor professorLider) {
      this.identificadorCNPQ = identificadorCNPQ;
      this.nome = nome;
      this.descricao = descricao;
      this.tema = tema;
      this.area = area;
      this.professorLider = professorLider;
   }

   public String getIdentificadorCNPQ() {
      return this.identificadorCNPQ;
   }

   public void setIdentificadorCNPQ(String identificadorCNPQ) {
      this.identificadorCNPQ = identificadorCNPQ;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getTema() {
      return this.tema;
   }

   public void setTema(String tema) {
      this.tema = tema;
   }

   public String getArea() {
      return this.area;
   }

   public void setArea(String area) {
      this.area = area;
   }

   public Professor getProfessorLider() {
      return this.professorLider;
   }

   public void setProfessorLider(Professor professorLider) {
      this.professorLider = professorLider;
   }

   public Date getDataCriacao() {
      return this.dataCriacao;
   }

   public void setDataCriacao(Date dataCriacao) {
      this.dataCriacao = dataCriacao;
   }

   public Date getDataExpiracao() {
      return this.dataExpiracao;
   }

   public void setDataExpiracao(Date dataExpiracao) {
      this.dataExpiracao = dataExpiracao;
   }

   public List<Professor> getProfessoresMembros() {
      return this.ProfessoresMembros;
   }

   public void setProfessoresMembros(List<Professor> ProfessoresMembros) {
      this.ProfessoresMembros = ProfessoresMembros;
   }
}