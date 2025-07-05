package repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Aluno;

public class AlunoRepository {
    private static final String ARQUIVO_TXT = "aluno.txt";
   
    // injeção de Dependência
public static void salvar(Aluno aluno) {
try (PrintWriter out = new PrintWriter(new FileWriter(ARQUIVO_TXT,true))) {
    if(new File (ARQUIVO_TXT).length() == 0 ){
        out.println("nome, endereco, idade, matricula");
    }
    out.printf("%s, %s, %d, %d%n", aluno.getNome(), 
                                   aluno.getEndereco(),
                                   aluno.getIdade(),
                                   aluno.getMatricula()
             );

}catch (IOException e) {
    System.err.println("Erro ao Salvar em TXT " + e.getMessage());
}
}   
}      
     
   

