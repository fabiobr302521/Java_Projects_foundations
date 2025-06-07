package aluno;
public class Aluno {
    private String nome;
    private String endereço;
    private int idade;
    private int matricula;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void mostrarAluno()
    {    System.out.println("Nome: " + nome);
         System.out.println("Endereço: " + endereço);
         System.out.println("Idade: " + idade);
         System.out.println("Nome: " + nome);

    
    
        }
}
