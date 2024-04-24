package br.com.JonasSmendes.api;

import br.com.JonasSmendes.models.ApiRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api{

    public ApiRecord HttpApi(String moedaAConverter, String moedaCovertida) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7cb440a440fbaaca393914a3/pair/"+moedaAConverter+"/"+moedaCovertida))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson()
                .newBuilder()
                .create();

        ApiRecord apiRecord = gson.fromJson(response.body(), ApiRecord.class);

        return apiRecord;
    }

}
