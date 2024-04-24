package br.com.JonasSmendes.models;

public class ConversorBase {

    private String moedaAConverter;
    private String moedaConvertida;
    private double valorDaConversao;

    public ConversorBase(ApiRecord apiRecord) {
        this.moedaAConverter = apiRecord.base_code();
        this.moedaConvertida = apiRecord.target_code();
        this.valorDaConversao = Double.parseDouble(apiRecord.conversion_rate());
    }

    public ConversorBase (){
    }

    public String getmoedaAConverter() {
        return moedaAConverter;
    }

    public String getmoedaConvertida() {
        return moedaConvertida;
    }

    public double getvalorDaConversao() {
        return valorDaConversao;
    }

    @Override
    public String toString() {
        return """
                convertendo: %s
                A converter: %s
                valor: %f
                """.formatted(moedaAConverter,moedaConvertida,valorDaConversao);
    }
}
