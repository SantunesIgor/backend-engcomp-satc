package org.example.empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Eduardo", "Correia", 2500.00);
        Empregado e2 = new Empregado("Carlos", "Monteiro", 4000.00);

        System.out.println(
                "Salario Anual:\n" +
                e1.getNome() + " " + e1.getSobrenome() + ": R$" + e1.getSalarioAnual() + "\n" +
                e2.getNome() + " " + e2.getSobrenome() + ": R$" + e2.getSalarioAnual() + "\n"
        );

        e1.setSalarioMensal(2500.00 * 1.1);
        e2.setSalarioMensal(4000.00 * 1.1);

        System.out.println(
                "Salario Anual (após aumento de 10%):\n" +
                e1.getNome() + " " + e1.getSobrenome() + ": R$" + e1.getSalarioAnual() + "\n" +
                e2.getNome() + " " + e2.getSobrenome() + ": R$" + e2.getSalarioAnual() + "\n"
        );

    }
}
