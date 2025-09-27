public class milho extends biocombustivel {
    public milho(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return quilogramas + 1000;
    }
}
