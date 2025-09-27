package exercicio3;

import java.time.Year;

public class data {
    private int dia;
    private int mes;
    private int ano;

    public data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (diaValido(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido: " + dia + " - Ajustado para 1");
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido: " + mes + " - Ajustado para 1");
            this.mes = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

    private boolean diaValido(int dia, int mes, int ano) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (mes == 2 && Year.isLeap(ano)) {
            return dia >= 1 && dia <= 29;
        }
        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }
}

