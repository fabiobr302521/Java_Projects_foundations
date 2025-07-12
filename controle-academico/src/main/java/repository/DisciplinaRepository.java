package repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import model.Disciplina;

public class DisciplinaRepository {

    private static final String ARQUIVO_TXT = "Disciplina.txt";

    public static void salvar(Disciplina disciplina) {

        try (PrintWriter out = new PrintWriter(new FileWriter(ARQUIVO_TXT, true))) {
            if (new File(ARQUIVO_TXT).length() == 0) {
                out.println("id,nome, cargaHoraria, categoria");
            }
            out.printf("%d, %s, %d, %s%n", disciplina.getId(),
                                           disciplina.getNome(),
                                           disciplina.getCargaHoraria(),
                                           disciplina.getCategoria());

        } catch (IOException e) {
            System.err.println("Erro ao Salvar em TXT " + e.getMessage());
        }
    }
}
