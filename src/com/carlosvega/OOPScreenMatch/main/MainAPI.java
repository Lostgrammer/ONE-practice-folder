package com.carlosvega.OOPScreenMatch.main;

import com.carlosvega.OOPScreenMatch.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        String titulo;
        //input del usuario
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el titulo de la pelicula que quiere encontrar");
        titulo = input.nextLine();

        String url = "https://www.omdbapi.com/?t=" + titulo + "&apikey=214a8fd4";
        //cliente
        HttpClient client = HttpClient.newHttpClient();
        //petiicion http
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        //http response
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = (response.body());
        System.out.println(json);
        //deseralizacion
        Gson gson = new Gson(); //creamos objeto Gson
        Title titulo1 = gson.fromJson(json, Title.class);;
        System.out.println(titulo1);

    }
}
