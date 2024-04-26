package com.nesProject.screenmatch.principal;

import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Serie;
import com.nesProject.screenmatch.models.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        var myMovie = new Movie("Matrix",2002);
        myMovie.valoration(9);
        var newMovie = new Movie("Batman",1998);
        newMovie.valoration(10);
        var movie2 = new Movie("Goxila",2001);
        movie2.valoration(8);
        var mySerie = new Serie("House of the dragon", 2002);

        List<Title> list = new LinkedList<>();
        list.add(myMovie);
        list.add(newMovie);
        list.add(movie2);
        list.add(mySerie);

        for(Title item: list) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getClasification() > 2){
                System.out.println(movie.getClasification());
            }

        }
        Collections.sort(list);
        System.out.println("Lista ordenada: "+ list);
        //
        ArrayList<String> Artists = new ArrayList<>();
        Artists.add("Juan");
        Artists.add("Maria");
        Artists.add("Pedro");
        Artists.add("Pablo");

        Collections.sort(Artists);
        System.out.println("Lista de artistas: "+ Artists);

        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("*************\n"+list);
    }
}
