package com.nesProject.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nesProject.screenmatch.exceptions.TimeConversionException;
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

        while (true) {
            String apiKey = "8a65ba68";
            System.out.println("Movie:");
            var search = scanner.nextLine();
            if (search.equalsIgnoreCase("Exit")) {
                break;
            }
            String url = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=" + apiKey;

            try {
                // Creating an HTTP client to make requests
                HttpClient client = HttpClient.newHttpClient();

                // Creating an HTTP GET request to fetch information from OMDB API
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                // Sending the request to the server and getting the response
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                // Printing the body of the response (in this case, the information
                // returned by the OMDB API)
                System.out.println(json);

                TitleOMDB myTitleOMDB = gson.fromJson(json, TitleOMDB.class);
                System.out.println(myTitleOMDB);

                Title myTitle = new Title(myTitleOMDB);
                System.out.println("Converted Title:\n" + myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("An error occurred: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("An error occurred: " + e.getMessage());
                System.out.println("Check the URL");
            } catch (TimeConversionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);
        FileWriter write = new FileWriter("titles.json");
        write.write(gson.toJson(titles));
        write.close();
        System.out.println("Program execution finished");

    }
}
