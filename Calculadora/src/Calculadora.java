
import javax.swing.JOptionPane;

public class Calculadora {
    private double n1;
    private double n2;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double soma() {
        return this.n1 + this.n2;
    }

    public double subtracao() {
        return this.n1 - this.n2;
    }

    public double multiplicacao() {
        return this.n1 * this.n2;
    }

    public double divisao() {
        return this.n1 / this.n2;
    }

    public void visualizarTodos() {
        JOptionPane.showMessageDialog(null,
                "Soma: " + this.soma() + "\n" +
                        "subtração: " + this.subtracao() + "\n" +
                        "multiplicação: " + this.multiplicacao() + "\n" +
                        "divisão: " + this.divisao() + "\n");

    }

    public void visualizar(String operacao) {
        double[] resultados = {
                this.soma(),
                this.subtracao(),
                this.divisao(),
                this.multiplicacao()
        };
        String operacoes = "+-/*";
        int indiceOperacao = operacoes.indexOf(operacao);

        JOptionPane.showMessageDialog(null, this.n1 + operacao + this.n2 + "=" + resultados[indiceOperacao]);
    }
}
