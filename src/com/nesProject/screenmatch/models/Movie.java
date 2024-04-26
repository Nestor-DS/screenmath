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

    @Override
    public int getClasification() {
        return (int) (mindCalule() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula"+this.getName()+" ("+getReleaseDate()+")";
    }
}
