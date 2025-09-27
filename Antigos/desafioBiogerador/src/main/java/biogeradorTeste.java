import java.util.ArrayList;

public class biogeradorTeste {
    public static void main(String[] args) {
        ArrayList<biocombustivel> combustiveis = new ArrayList<>();
        combustiveis.add(new canaAcucar(2000));
        combustiveis.add(new beterraba(3000));
        combustiveis.add(new milho(1500));
        combustiveis.add(new beterraba(3500));
        combustiveis.add(new beterraba(2000));

        biogerador gerador = new biogerador();

        for (biocombustivel b : combustiveis) {
            try {
                gerador.carregar(b);
            } catch (geradorCheioException e) {
                System.out.println("Erro: " + e.getMessage());
                break;
            }
        }

        System.out.printf("Potência gerada no gerador 01: %.2f%n", gerador.getPotenciaAtual());
        System.out.printf("Carga atual do gerador 01: %.0f%n", gerador.getCargaAtual());
    }
}
