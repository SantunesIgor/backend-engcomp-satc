import java.util.Random;

public class biocombustivel {
    protected float quilogramas;

    public biocombustivel() {
        this.quilogramas = 1000;
    }

    public biocombustivel(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float getQuilogramas() {
        return quilogramas;
    }

    public void setQuilogramas(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float processar() {
        Random random = new Random();
        int n = random.nextInt(3) + 1; // entre 1 e 3
        return quilogramas * n;
    }
}
