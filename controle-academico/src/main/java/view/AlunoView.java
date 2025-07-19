package view;

import javax.swing.JOptionPane;
import model.Aluno;
import model.Endereco;
import repository.AlunoRepository;
import service.EnderecoService;

public class AlunoView {

   public static void executar() throws Exception {
      String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");

      String idadeString = JOptionPane.showInputDialog("Digita a idade do aluno: ");
      int idade = Integer.parseInt(idadeString);

      String cepString = JOptionPane.showInputDialog("Digite o CEP do Aluno: ");
      String numeroString = JOptionPane.showInputDialog("Digite o numero do endereço do aluno: ");
      String complementoString = JOptionPane.showInputDialog("Digite complemento do endereço do aluno");

      Endereco endereco = new Endereco(cepString, numeroString, complementoString);
      EnderecoService.completarEnderecoViaCep(endereco);
      // retorna com os dados do enderecp

      Aluno aluno = new Aluno(nome, endereco, idade);
      aluno.visualizar();

      // Persisntencia de dados em arquivo .txt
      AlunoRepository.salvar(aluno);

      // Exportar para CSV
      AlunoRepository.exportarParaCSV();

   }
}
