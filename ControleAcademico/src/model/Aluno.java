package model;

public class Aluno {
    private String nome;
    private String endereco;
    private int idade;
    private int matricula;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, int idade, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = matricula;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", matricula=" + matricula + "]";
    }

    public void visualizar() {
        System.out.println("nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("idade: " + idade);
        System.out.println("Número da Matrícula: " + matricula);

    }

}
