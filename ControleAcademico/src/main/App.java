package main;

import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome( " Pedro Henrique");
        aluno.setEndereco( " Convivio");
        aluno.setIdade( 17);
        aluno.setMatricula( 1);
    

        // System.out.println(aluno);
         aluno.visualizar();
    
        Aluno aluno2 = new Aluno("Peterson ALves",
         "cohab2", 
         30,
         17);
        System.out.println();
         aluno2.visualizar();
    
        }


}
