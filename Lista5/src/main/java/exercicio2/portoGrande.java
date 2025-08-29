package exercicio2;

public class portoGrande extends basePorto {
    public portoGrande(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(barco barco) {
        if (barco.getTamanho() >= 10) {
            return super.atracarBarco(barco);
        }
        return false;
    }
}

