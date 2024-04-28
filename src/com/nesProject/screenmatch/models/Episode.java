package com.nesProject.screenmatch.models;

import com.nesProject.screenmatch.calculations.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Series series;
    private int totalViews;

    // Getter and Setter

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return series;
    }

    public void setSerie(Series series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    /**
     * Gets the classification of the episode based on its total views.
     * @return The classification of the episode.
     */
    @Override
    public int getClassification() {
        if(totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
