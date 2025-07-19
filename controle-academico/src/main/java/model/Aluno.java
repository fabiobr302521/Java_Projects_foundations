package model;

import java.util.Random;

public class Aluno {
    private String nome;
    private Endereco endereco;
    private int idade;
    private int matricula;

    public Aluno() {
    }

    public Aluno(String nome, Endereco endereco, int idade) {
        this.nome = nome;
        
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = this.gerarMatricula();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
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
    public int gerarMatricula() {
        Random rand = new Random ();
        int matricula = rand.nextInt(9999) + 1;
        return matricula;
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

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
