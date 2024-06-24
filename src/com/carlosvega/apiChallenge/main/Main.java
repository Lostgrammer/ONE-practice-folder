package com.carlosvega.apiChallenge.main;

import com.carlosvega.apiChallenge.models.Character;
import com.carlosvega.apiChallenge.models.CharacterApi;
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
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String id;
        String responseUser = "";
        List <Character> characterList = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        try {
            while (!responseUser.equalsIgnoreCase("salir")){
                System.out.println("Introduzca el id del personaje que quiere ver");
                id = input.nextLine();
                String url = "https://rickandmortyapi.com/api/character/" + id;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = (response.body());
                System.out.println(json);

                CharacterApi characterApi = gson.fromJson(json, CharacterApi.class);
                System.out.println(characterApi.toString());
                Character character = new Character(characterApi);
                characterList.add(character);
                //System.out.println(character);

                System.out.println("Desea ingresa otro personaje? \n" +
                        "Para continuar pulse enter \n" +
                        "Para terminar el programa envie 'salir'");
                responseUser = input.nextLine();
            }
        }catch (Exception e){
            System.out.println("Ocurrio el siguiente error" + e);
        }
        //document
        System.out.println("Generando archivo de personajes . . .");
        FileWriter writer = new FileWriter("rickMortyCharacters.json");
        writer.write(gson.toJson(characterList));
        writer.close();
    }
}
