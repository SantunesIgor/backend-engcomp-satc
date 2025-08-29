package exercicio2;

public class portoPequeno extends basePorto {
    public portoPequeno(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(barco barco) {
        if (barco.getTamanho() <= 10) {
            return super.atracarBarco(barco);
        }
        return false;
    }
}

