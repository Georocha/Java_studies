package br.edu.ifs.loja.service;

import java.util.UUID;

public class GeradorId {
    private static GeradorId instancia;

    private GeradorId() {}

    public static GeradorId getInstance() {
        if (instancia == null) {
            instancia = new GeradorId();
        }
        return instancia;
    }

    public String gerarIdUnico() {
        return UUID.randomUUID().toString();
    }
}
