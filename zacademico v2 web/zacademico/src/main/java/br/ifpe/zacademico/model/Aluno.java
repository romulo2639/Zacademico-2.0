package br.ifpe.zacademico.model;

public class Aluno extends Usuario{
    private String matricula;
    private String tipoSanguineo;
    private String escolaOrigem;

    public Aluno(){
        super("", "", 0, "");
    }
    
    public Aluno(String nome, String emailPessoal, int idade, String cpf){
    
        super(nome, emailPessoal, idade, cpf);
        this.matricula = matricula;
    
    }
    
    public String getMatricula(){  
    return this.matricula;
    }

    public void setMatricula(String matricula){
    this.matricula = matricula;
    }

    public String getTipoSanguineo(){
        return this.tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getEscolaOrigem(){
        return this.escolaOrigem;
    }

    public void setEscolaOrigem(String escolaOrigem){
        this.escolaOrigem = escolaOrigem;
    };
    
    
};
