package repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import model.Professor;

public class ProfessorRepository {
    private static final String  ARQUIVO_TXT = "professor.txt";

    public static void salvar(Professor professor) {
try (PrintWriter out = new PrintWriter(new FileWriter(ARQUIVO_TXT,true))) {
    if(new File (ARQUIVO_TXT).length() == 0 ){
        out.println("nome, endereco, idade, cpf, Atuaçao ");}

         out.printf("%s, %s, %d, %s, %s%n", professor.getNome(), 
                                        professor.getEndereco(),
                                        professor.getIdade(),
                                        professor.getCPF(),
                                        professor.getAtuacao());

                                  
} catch (IOException e) {
    System.err.println("Erro ao Salvar em TXT " + e.getMessage());
}
}
}
