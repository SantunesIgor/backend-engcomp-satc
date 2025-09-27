package exercicio2;

public class empregadoTeste {
    public static void main(String[] args) {
        empregado emp1 = new empregado("João", "Silva", 3000.0);
        empregado emp2 = new empregado("Maria", "Oliveira", 4500.0);

        System.out.println("Salário anual antes do aumento:");
        System.out.println(emp1.getNome() + ": R$" + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + ": R$" + emp2.getSalarioAnual());

        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        System.out.println("\nSalário anual após 10% de aumento:");
        System.out.println(emp1.getNome() + ": R$" + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + ": R$" + emp2.getSalarioAnual());
    }
}

