package view;

import javax.swing.JOptionPane;
import model.Professor;
import repository.ProfessorRepository;

public class ProfessorView {
    public static void executar() throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do Professor: ");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do Professor: ");
        String idadeString = JOptionPane.showInputDialog("Digita a idade do Professor: ");
        int idade = Integer.parseInt(idadeString);
        String CPF = JOptionPane.showInputDialog("Digite CPF do Professor: ");
        String atuacao = JOptionPane.showInputDialog("Digite Atuação do Professor: ");

        Professor professor = new Professor(nome, endereco, idade, CPF, atuacao);
        professor.visualizar();

        ProfessorRepository.salvar(professor);

        
    }
}
