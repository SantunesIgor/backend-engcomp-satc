package exercicio1;

public class faturaTeste {
    public static void main(String[] args) {
        fatura f1 = new fatura("001", "Mouse óptico", 2, 50.0);
        fatura f2 = new fatura("002", "Teclado mecânico", -1, -100.0);

        System.out.println("Fatura 1:");
        System.out.println("Número: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQuantidade());
        System.out.println("Preço por item: R$" + f1.getPrecoPorItem());
        System.out.println("Total: R$" + f1.getTotalFatura());

        System.out.println("\nFatura 2:");
        System.out.println("Número: " + f2.getNumero());
        System.out.println("Descrição: " + f2.getDescricao());
        System.out.println("Quantidade: " + f2.getQuantidade());
        System.out.println("Preço por item: R$" + f2.getPrecoPorItem());
        System.out.println("Total: R$" + f2.getTotalFatura());
    }
}

