import javax.swing.JOptionPane;

public class Calculadoratester {
    public static void main(String[] args) throws Exception {
        String n1String = JOptionPane.showInputDialog("Digite um numero : ");
        String n2String = JOptionPane.showInputDialog("Digite outro numero : ");

        double n1 = Double.parseDouble(n1String);
        double n2 = Double.parseDouble(n2String);

        Calculadora c = new Calculadora();
        c.setN1(n1);
        c.setN2(n2);
        //c.visualizarTodos();
       c.visualizar("+");
    }
}
