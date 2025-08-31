public class canaAcucar extends biocombustivel {
    public canaAcucar(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return quilogramas * 3.5f;
    }
}
