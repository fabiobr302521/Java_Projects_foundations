package aluno;

public class CadAluno {

    public static void main(String[] args){
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno.setNome( " Fábio ");
        aluno2.setNome( " Ana");

        System.out.println(aluno.getNome());    
        aluno2.mostrarAluno();
    }
}
