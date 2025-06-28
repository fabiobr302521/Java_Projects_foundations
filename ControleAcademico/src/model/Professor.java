package model;

public class Professor {

  private String nome;
  private String endereco;
  private int idade;
  private String CPF;
  private String atuacao;

  public Professor(String nome, String endereco, int idade, String CPF, String atuacao) {
    this.nome = nome;
    this.endereco = endereco;
    this.idade = idade;
    this.CPF = CPF;
    this.atuacao = atuacao;
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

  public String getAtuacao() {
    return atuacao;
  }

  public void setAtuacao(String atuacao) {
    this.atuacao = atuacao;
  }

  @Override
  public String toString() {
    return "Professor [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", CPF=" + CPF + ", Atuação="
        + atuacao + "]";
  }

  public void visualizar() {
    System.out.println("nome: " + nome);
    System.out.println("Endereco: " + endereco);
    System.out.println("idade: " + idade);
    System.out.println("CPF: " + CPF);
    System.out.println("Atução: " + atuacao);

  }

}
