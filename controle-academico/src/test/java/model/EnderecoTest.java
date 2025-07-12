package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EnderecoTest {
    
    @Test
    public void testConstrutorComParametros(){
        Endereco end = new Endereco(
            "18605407",
            "200",
            "casa");

            assertEquals("18605407", end.getCep());
            assertEquals("200", end.getNumero());
            assertEquals("casa", end.getComplemento());

    }
}
