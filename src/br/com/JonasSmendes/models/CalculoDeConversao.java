package br.com.JonasSmendes.models;

import br.com.JonasSmendes.api.Api;

import java.io.IOException;

public class CalculoDeConversao {

    private double valor;
    private ConversorBase conversorBase;

    private Api api;

    public CalculoDeConversao (ConversorBase conversorBase, Api api){
        this.conversorBase = conversorBase;
        this.api = api;

    }

    public CalculoDeConversao (){

    }

    public void calculo (double valor){
        if (api == null) {
            throw new NullPointerException("O objeto Api não foi inicializado corretamente.");
        }

        double valorDaMoeda = conversorBase.getvalorDaConversao();
        this.valor = valor / valorDaMoeda ;
    }

    public CalculoDeConversao urlCustomizada( String MoedaAConverter, String moedaConvertida) throws IOException, InterruptedException {
        Api api = new Api();

        ConversorBase conversorBase = new ConversorBase(api.HttpApi(moedaConvertida,MoedaAConverter));
        return new CalculoDeConversao(conversorBase, api);
    }

    public double getValor() {
        return valor;
    }
}
