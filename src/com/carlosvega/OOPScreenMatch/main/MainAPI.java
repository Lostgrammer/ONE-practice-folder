package com.carlosvega.OOPScreenMatch.main;

import com.carlosvega.OOPScreenMatch.models.Title;
import com.carlosvega.OOPScreenMatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        String json = (response.body());//string json
        System.out.println(json + "\n");
        //deseralizacion
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();//modificamos el objeto gson para que acepte minusculas como parametro en TitleOmdb

        TitleOmdb tituloOmdb = gson.fromJson(json, TitleOmdb.class);
        System.out.println(tituloOmdb);

        //uso de try catch para identificar el error
        try{
            Title titulo1 = new Title(tituloOmdb);
            System.out.println(titulo1);
        }catch (NumberFormatException e){
            System.out.println("OCURRIO UN ERROR: \n" + e);
        }finally {
            System.out.println("Finalizo la ejecucucion de API");
        }


    }
}
