package org.example.data;

import java.time.Year;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        if(dia < 1 || dia > quantDias(mes, ano)) {
            throw new IllegalArgumentException("Dia inválido!");
        }
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    private int quantDias(int mes, int ano) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return Year.isLeap(ano) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Mês inválido");
        }
    }

    public void displayData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if(mes < 1 || mes < 12){
            throw new IllegalArgumentException("Mês inválido");
        }
        this.mes = mes;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if(dia < 1 || dia > quantDias(this.mes, this.ano)) {
            throw new IllegalArgumentException("Dia inválido!");
        }
        this.dia = dia;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
