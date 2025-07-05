package view;

import javax.swing.JOptionPane;
import model.Aluno;
import repository.AlunoRepository;

public class AlunoView {

   public static void executar() throws Exception {
      String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
      String endereco = JOptionPane.showInputDialog("Digite o endereço do Aluno: ");
      String idadeString = JOptionPane.showInputDialog("Digita a idade do aluno: ");
      int idade = Integer.parseInt(idadeString);
      

      Aluno aluno = new Aluno(nome, endereco, idade);
      aluno.visualizar();

     
    AlunoRepository.salvar(aluno);

   }
}
