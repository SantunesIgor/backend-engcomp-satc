package exercicio3;

public class dataTeste {
    public static void main(String[] args) {
        data d1 = new data(28, 2, 2024); // Ano bissexto
        data d2 = new data(31, 4, 2025); // Abril tem 30 dias
        data d3 = new data(29, 2, 2025); // 2025 não é bissexto

        System.out.println("Datas:");
        d1.displayData();
        d2.displayData();
        d3.displayData();
    }
}

