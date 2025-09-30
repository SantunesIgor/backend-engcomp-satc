package org.example;

import java.util.Random;

public class Biocombustivel {
    private float quilogramas;

    public Biocombustivel(){
        this.quilogramas = 1000;
    }

    public Biocombustivel(float quilogramas){
        this.quilogramas = quilogramas;
    }

    public float processar(){
        Random rand = new Random();
        return this.quilogramas * rand.nextInt(3) + 1;
    }
}
