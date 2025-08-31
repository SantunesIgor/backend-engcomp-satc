public class beterraba extends biocombustivel {
    public beterraba(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return (quilogramas * 1.2f) + 1000;
    }
}
