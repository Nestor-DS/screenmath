package com.nesProject.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nesProject.screenmatch.exceptions.TimeConvertionException;
import com.nesProject.screenmatch.models.Title;
import com.nesProject.screenmatch.models.TitleOMDB;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        var scanner = new Scanner(System.in);

        List<Title> titles = new LinkedList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            String apikey = "8a65ba68";
            System.out.println("Pelicula:");
            var search = scanner.nextLine();
            if(search.equalsIgnoreCase("Exit")){
                break;
            }
            String url = "http://www.omdbapi.com/?t="+search.replace(" ","+")+"&apikey="+apikey;

            try{
                // Creación de un cliente HTTP para realizar solicitudes
                HttpClient client = HttpClient.newHttpClient();

                // Creación de una solicitud HTTP GET para buscar información en la API de OMDB
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                // Envío de la solicitud al servidor y obtención de la respuesta
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                // Imprimir el cuerpo de la respuesta (en este caso, la información
                // devuelta por la API de OMDB)
                System.out.println(json);



                TitleOMDB myTitleOMDB = gson.fromJson(json, TitleOMDB.class);
                System.out.println(myTitleOMDB);

                Title myTitle = new Title(myTitleOMDB);
                System.out.println("Titulo convertido:\n"+myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Ocurrio un error: " + e.getMessage());
                System.out.println("Verifica la URL");
            } catch (TimeConvertionException e) {
                System.out.println(e.getMesaje());
            }
        }
        System.out.println(titles);
        FileWriter write = new FileWriter("titles.json");
        write.write(gson.toJson(titles));
        write.close();
        System.out.println("Finalizo la ejecucción del programa");

    }
}
