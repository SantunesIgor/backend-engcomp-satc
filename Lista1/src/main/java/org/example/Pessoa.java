package org.example;

public class Pessoa {
    float peso;
    float altura;

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        float IMC = peso/(altura*altura);
        return IMC;
    }
}
