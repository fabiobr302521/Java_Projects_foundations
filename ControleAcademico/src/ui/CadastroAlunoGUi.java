package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Aluno;

public class CadastroAlunoGUi {
   public static void executar() throws Exception {
    String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
    String endereco = JOptionPane.showInputDialog("Digite o endereço do Aluno: ");
    String idadeString = JOptionPane.showInputDialog("Digita a idade do aluno: ");
    int idade = Integer.parseInt(idadeString);
    String matriculaString = JOptionPane.showInputDialog("Digite a matricula do aluno: ");
    int matricula = Integer.parseInt(matriculaString);

    Aluno aluno = new Aluno (nome, endereco, idade, matricula);
    aluno.visualizar();

    // Persistencia de dados em arquivos - .txt
    PrintWriter saida = new PrintWriter("aluno.txt");
    saida.println( "nome  endereço  idade   matricula");
    saida.println(aluno.getNome() + ", " + 
    aluno.getEndereco() + "," + 
    aluno.getIdade() + "," + 
    aluno.getMatricula());
    
    
    saida.close();


   } 
}
