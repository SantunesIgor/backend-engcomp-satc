package exercicio2;

public class empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal < 0 ? 0 : salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 13;
    }

    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * percentual / 100;
    }
}

