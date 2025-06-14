package model;

public class Professor {

    private String nome;
    private String endereco;
    private int idade;
    private String CPF;
    private String Atuação;


  public Professor(String nome, String endereco, int idade, String CPF, String Atuação) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.CPF = CPF;
        this.Atuação = Atuação;
    }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    CPF = cPF;
  }

  public String getAtuação() {
    return Atuação;
  }

  public void setAtuação(String atuação) {
    Atuação = atuação;
  }

  @Override
  public String toString() {
    return "Professor [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", CPF=" + CPF + ", Atuação="
            + Atuação + "]";
  }
    









}
