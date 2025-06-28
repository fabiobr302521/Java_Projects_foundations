package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Professor;

public class CadastroProfessorGui {
    public static void executar() throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do Professor: ");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do Professor: ");
        String idadeString = JOptionPane.showInputDialog("Digita a idade do Professor: ");
        int idade = Integer.parseInt(idadeString);
        String CPF = JOptionPane.showInputDialog("Digite CPF do Professor: ");
        String atuacao = JOptionPane.showInputDialog("Digite Atuação do Professor: ");

        Professor professor = new Professor(nome, endereco, idade, CPF, atuacao);
        professor.visualizar();

        PrintWriter saida = new PrintWriter("professor.txt");
        saida.println("nome endereço idade CPF Atuação");
        saida.println(professor.getNome() + ", " +
                professor.getEndereco() + "," +
                professor.getIdade() + "," +
                professor.getCPF() + "," +
                professor.getAtuacao());

        saida.close();

    }
}
