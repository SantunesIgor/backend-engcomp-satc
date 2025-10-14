package com.example.WeatherAPI.dto;

public class WeatherResponse {
    private String cidade;
    private float temperatura;
    private float umidade;

    public WeatherResponse(String cidade, float temperatura, float umidade) {
        this.cidade = cidade;
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }
}
