package br.edu.ifs.loja.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double precoAtual;
    private List<Double> historicoPrecos;

    public Produto(String nome, double precoAtual) {
        this.nome = nome;
        this.precoAtual = precoAtual;
        this.historicoPrecos = new ArrayList<>();
        this.historicoPrecos.add(precoAtual);
    }

    public void atualizarPreco(double novoPreco) {
        this.precoAtual = novoPreco;
        this.historicoPrecos.add(novoPreco);
    }

    public List<Double> getHistoricoPrecos() {
        return historicoPrecos;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public String getNome() {
        return nome;
    }
}

