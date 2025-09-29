package org.example.fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("1", "Geladeira Eletrolux 2 Portas", 1, 1800.00);
        Fatura f2 = new Fatura("2", "Iphone 28", 2, 17000.00);

        System.out.println(
                "Fatura 1:" +
                "\nNúmero: " + f1.getNumero() +
                "\nDescrição: " + f1.getDescricao() +
                "\nQuantidade: " + f1.getQuantidade() +
                "\nPreço unitário: " + f1.getPrecoPorItem() +
                "\nTotal da fatura: " + f1.getTotalFatura()
        );

        System.out.println(
                "\nFatura 2:" +
                "\nNúmero: " + f2.getNumero() +
                "\nDescrição: " + f2.getDescricao() +
                "\nQuantidade: " + f2.getQuantidade() +
                "\nPreço unitário: " + f2.getPrecoPorItem() +
                "\nTotal da fatura: " + f2.getTotalFatura()
        );
    }
}
