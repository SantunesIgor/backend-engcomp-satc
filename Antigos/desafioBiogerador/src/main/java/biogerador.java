public class biogerador {
    private float potenciaAtual;
    private float cargaAtual;
    private final float cargaMaxima;

    public biogerador() {
        this.potenciaAtual = 0;
        this.cargaAtual = 0;
        this.cargaMaxima = 5;
    }

    public float getPotenciaAtual() {
        return potenciaAtual;
    }

    public void setPotenciaAtual(float potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public float getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(float cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void carregar(biocombustivel b) throws geradorCheioException {
        if (cargaAtual >= cargaMaxima) {
            throw new geradorCheioException("O gerador já está cheio!");
        }

        float energia = b.processar() * 2.36f;
        potenciaAtual += energia;
        cargaAtual++;
    }

    public void esvaziar() {
        potenciaAtual = 0;
        cargaAtual = 0;
    }
}
