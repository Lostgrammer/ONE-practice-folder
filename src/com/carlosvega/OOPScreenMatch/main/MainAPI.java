package com.carlosvega.OOPScreenMatch.main;

import com.carlosvega.OOPScreenMatch.models.Title;
import com.carlosvega.OOPScreenMatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        //variables
        String titulo;
        char[] charArrayTitulo;
        String answerContinue;
        String quitWord = "salir";
        List<Title> moviesList = new ArrayList<>();
        Scanner input = new Scanner(System.in); //input del usuario
        //objeto gson para deserealizar
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()//para ordenar el json
                .create();//modificamos el objeto gson para que acepte minusculas como parametro en TitleOmdb
        while (true){
            System.out.println("Introduzca el titulo de la pelicula que quiere encontrar");
            titulo = input.nextLine();

            //string to array
            StringBuilder stringBuilder = new StringBuilder(); //objeto para unir caracteres en un string
            charArrayTitulo = titulo.toCharArray();
            for (Character i : charArrayTitulo){
                if (i.equals(' ')){
                    i = '+';
                }
                stringBuilder.append(i);
            }
            //array to String
            titulo = stringBuilder.toString();

            //colocar try hasta aca por las dependencias de cada objeto variable
            try{
                String url = "https://www.omdbapi.com/?t=" + titulo + "&apikey=214a8fd4";
                //cliente
                HttpClient client = HttpClient.newHttpClient();
                //petiicion http
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))//la excepcion se genera aca
                        .build();
                //http response
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = (response.body());//string json
                //mostrando el jsond e la api
                System.out.println(json + "\n");
                //deserializando
                TitleOmdb tituloOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(tituloOmdb);//mostrando desde el record
                //ingresando como parametro el record tituloOmdb para el objeto de clase Title
                Title mytitle = new Title(tituloOmdb);
                System.out.println(mytitle);
                //agregando pelicula a la lista
                moviesList.add(mytitle); //el objeto se va a sobreescribir por cada titulo que agreguemos

            }
            catch (NumberFormatException e){
                System.out.println("OCURRIO UN ERROR: \n" + e);
            }catch (IllegalArgumentException e){
                System.out.println("Error en la generacion de URI, modifique su codigo");
            }
            System.out.println("Envie 'salir' para terminar el registro o cualquier tecla para continuar");
            answerContinue = input.nextLine();
            if (answerContinue.equalsIgnoreCase(quitWord)){
                break;
            }
        }
        System.out.println("Finalizo la ejecucucion de API");
        //agregando lista al archivo
        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(moviesList)); //serializar lista a json
        writer.close();
    }
}
