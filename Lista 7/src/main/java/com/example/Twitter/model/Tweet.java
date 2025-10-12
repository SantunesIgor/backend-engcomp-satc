package com.example.Twitter.model;

import java.time.LocalDate;
import java.util.UUID;

public class Tweet {
    private UUID id;
    private String mensagem;
    private boolean editado;
    private LocalDate dataCriacao;

    public Tweet(String mensagem) {
        this.id = UUID.randomUUID();
        this.mensagem = mensagem;
        this.editado = false;
        this.dataCriacao = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public boolean isEditado() {
        return editado;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setEditado(boolean editado) {
        this.editado = editado;
    }
}
