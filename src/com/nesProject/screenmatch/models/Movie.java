package com.nesProject.screenmatch.models;

import com.nesProject.screenmatch.calculations.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    /**
     * Gets the classification of the movie.
     * @return The classification of the movie.
     */
    @Override
    public int getClassification() {
        return (int) (mindCalculate() / 2); // assuming mindCalculate is a method in the superclass
    }

    /**
     * Returns a string representation of the movie.
     * @return A string representation of the movie.
     */
    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + getReleaseDate() + ")";
    }
}
