package com.nesProject.screenmatch.principal;

import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Series;
import com.nesProject.screenmatch.models.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        var myMovie = new Movie("Matrix", 2002);
        myMovie.valoration(9);
        var newMovie = new Movie("Batman", 1998);
        newMovie.valoration(10);
        var movie2 = new Movie("Godzilla", 2001);
        movie2.valoration(8);
        var mySeries = new Series("House of the Dragon", 2002);

        List<Title> list = new LinkedList<>();
        list.add(myMovie);
        list.add(newMovie);
        list.add(movie2);
        list.add(mySeries);

        for (Title item : list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println(movie.getClassification());
            }
        }
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Sorting an ArrayList of strings
        ArrayList<String> artists = new ArrayList<>();
        artists.add("Juan");
        artists.add("Maria");
        artists.add("Pedro");
        artists.add("Pablo");

        Collections.sort(artists);
        System.out.println("List of artists: " + artists);

        // Sorting the list by release date
        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("*************\n" + list);
    }
}
