package service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import model.Endereco;

public class EnderecoServiceTest {
    @Test
    public void testcompletarEnderecocepValido() throws IOException, InterruptedException {
        Endereco endereco = new Endereco("01001-000", "100", "Bloco A");
        EnderecoService.completarEnderecoViaCep(endereco);

        assertEquals("01001-000", endereco.getCep());
        assertNotNull(endereco.getLogradouro());
        assertEquals("Sé", endereco.getBairro());
        assertEquals("São Paulo", endereco.getLocalidade());
        assertEquals("SP", endereco.getUf());
    }

    @Test
    public void testcompletarEnderecoCepInvalido() throws IOException, InterruptedException {
        Endereco endereco = new Endereco("00000-000", "100", "Bloco A");
        assertNull(endereco.getLogradouro());
        //assertDoesNotThrow(() -> EnderecoService.completarEnderecoViaCep(endereco));
        //assertEquals("true",endereco);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { EnderecoService.completarEnderecoViaCep(endereco);
        });
        
        assertTrue(exception.getMessage().contains("CEP invalido"));        
       }

       //186000-000 ou 18600000
       @Test
       public void  testFormatoNumericoCepInvalido() {
        Endereco endereco = new Endereco("123-456", "100", "Bloco A");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> { EnderecoService.completarEnderecoViaCep(endereco);
        });
        
        assertTrue(exception.getMessage().contains("Formato de cep inválido"));        
       }

@Test
       public void  testFormatoNuCepInvalido() {
        Endereco endereco = new Endereco(null, "100", "Bloco A");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> { EnderecoService.completarEnderecoViaCep(endereco);
        });
        
        assertTrue(exception.getMessage().contains("Formato de cep inválido"));        
       }

       }

