package com.nesProject.screenmatch.models;

import screenmatch.calculations.Clasification;

public class Movie extends Title implements Clasification {
    private String director;

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
}
