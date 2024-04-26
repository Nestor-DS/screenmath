package com.nesProject.screenmatch.principal;

import com.nesProject.screenmatch.models.Episodes;
import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Serie;
import com.nesProject.screenmatch.calculations.RecommendedFilters;
import com.nesProject.screenmatch.calculations.TimeCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Matrix",2002);
        myMovie.setDurationMin(129);
        myMovie.setIncludedInPlan(true);

        myMovie.valoration(10);
        myMovie.valoration(8);
        myMovie.valoration(7.8);
        System.out.println("Valoration: "+myMovie.getTotalEvaluations());
        System.out.println("Total: "+ myMovie.mindCalule());

        Serie mySerie = new Serie("House of the dragon", 2002);
        mySerie.setSeasons(7);
        mySerie.setDurationMin(120);
        mySerie.setEpisodesSeason(10);
        mySerie.sampleTechnicalSheet();
        System.out.println(mySerie.getDurationMin());

        Movie newMovie = new Movie("Batman",1998);
        newMovie.setDurationMin(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(mySerie);
        calculator.include(newMovie);
        System.out.println(" Tiempo nesesario para ver los titulos disponibles:" +
                calculator.getTotalTime() + " minutos");

        RecommendedFilters recommendedFilters = new RecommendedFilters();
        recommendedFilters.filter(myMovie);

        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setName("Targaryen house");
        episode.setSerie(mySerie);
        episode.setTotalViews(50);
        recommendedFilters.filter(episode);

        //
        var movie2 = new Movie("Goxila",2001);
        movie2.setDurationMin(120);

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(myMovie);
        movieArrayList.add(newMovie);
        movieArrayList.add(movie2);
        movieArrayList.add(0, movie2);

        System.out.println("Tamaño:"+movieArrayList.size());
        System.out.println("La primera pelicula es: "+movieArrayList.get(0).getName());
        System.out.println(movieArrayList.toString());
        System.out.println("ToString de la pelicula: "+movieArrayList.get(0).toString());


    }
}
