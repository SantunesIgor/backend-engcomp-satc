package exercicio5;

public class ingresso {
    private cliente cliente;
    private filme filme;
    private String assento;

    public ingresso(cliente cliente, filme filme, String assento) {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }

    public String getAssento() { return assento; }
    public cliente getCliente() { return cliente; }
    public filme getFilme() { return filme; }
}

