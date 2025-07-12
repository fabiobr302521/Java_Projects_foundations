package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProfessorTest {
    
  @Test
    public void testConstrutorComParametros() {
        Professor professor = new Professor(
        "Paulo",
        "Rua 5",
        29,
        "111.222.333.444",
        "Analista");

        assertEquals("Paulo", professor.getNome());
        assertEquals("Rua 5", professor.getEndereco());
        assertEquals( 29, professor.getIdade());
        assertEquals("111.222.333.444", professor.getCPF());
        assertEquals("Analista", professor.getAtuacao());

        
    }
    @Test
    public void testConstrutorSemParametros() {

        Professor professor = new Professor( "Paulo",
        "Rua 5",
        29,
        "111.222.333.444",
        "Analista"

        );

        professor.setNome("Pedro");
        professor.setEndereco("Rua 1");
        professor.setIdade(29);
        professor.setCPF("111.222.333.444");
        professor.setAtuacao("Analista");
        
        
        assertEquals("Pedro", professor.getNome());
        assertEquals("Rua 1", professor.getEndereco());
        assertEquals(29, professor.getIdade());
        

    }


}
