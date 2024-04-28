package com.nesProject.screenmatch.principal;

import com.nesProject.screenmatch.models.Episode;
import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Series;
import com.nesProject.screenmatch.calculations.RecommendedFilters;
import com.nesProject.screenmatch.calculations.TimeCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Matrix", 2002);
        myMovie.setDurationMin(129);
        myMovie.setIncludedInPlan(true);

        myMovie.valoration(10);
        myMovie.valoration(8);
        myMovie.valoration(7.8);
        System.out.println("Rating: " + myMovie.getTotalEvaluations());
        System.out.println("Average Rating: " + myMovie.mindCalculate());

        Series mySeries = new Series("House of the Dragon", 2002);
        mySeries.setSeasons(7);
        mySeries.setDurationMin(120);
        mySeries.setEpisodesPerSeason(10);
        mySeries.sampleTechnicalSheet();
        System.out.println("Total duration: " + mySeries.getDurationMin());

        Movie newMovie = new Movie("Batman", 1998);
        newMovie.setDurationMin(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(mySeries);
        calculator.include(newMovie);
        System.out.println("Total time required to watch available titles: " +
                calculator.getTotalTime() + " minutes");

        RecommendedFilters recommendedFilters = new RecommendedFilters();
        recommendedFilters.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Targaryen House");
        episode.setSerie(mySeries);
        episode.setTotalViews(50);
        recommendedFilters.filter(episode);

        //
        var movie2 = new Movie("Godzilla", 2001);
        movie2.setDurationMin(120);

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(myMovie);
        movieArrayList.add(newMovie);
        movieArrayList.add(movie2);
        movieArrayList.add(0, movie2);

        System.out.println("Size: " + movieArrayList.size());
        System.out.println("The first movie is: " + movieArrayList.get(0).getName());
        System.out.println(movieArrayList.toString());
        System.out.println("ToString of the movie: " + movieArrayList.get(0).toString());
    }
}
