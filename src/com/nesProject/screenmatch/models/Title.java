package com.nesProject.screenmatch.models;

import com.nesProject.screenmatch.exceptions.TimeConversionException;

public class Title implements Comparable<Title> {

    // Variables
    private String name;
    private int releaseDate;

    private int durationMin;
    private boolean includedInPlan;
    private double sumEvaluation;
    private int totalEvaluations;

    // Constructors

    public Title(TitleOMDB titleOMDB) {
        this.name = titleOMDB.title();
        this.releaseDate = Integer.valueOf(titleOMDB.year());
        if (titleOMDB.runtime().contains("N/A")) {
            throw new TimeConversionException("Failed to convert duration: N/A value found.");
        }
        this.durationMin = Integer.valueOf(titleOMDB.runtime().substring(0, 3).replace(" ", ""));
    }

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    // Functions

    public void sampleTechnicalSheet() {
        System.out.println(String.format("The name of the movie is %s released in %d with a duration of %d minutes",
                name, releaseDate, getDurationMin()));
    }

    public void valoration(double note) {
        sumEvaluation += note;
        totalEvaluations++;
    }

    public double mindCalculate() {
        return sumEvaluation / totalEvaluations;
    }

    // Comparable Interface

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    // String representation

    @Override
    public String toString() {
        return "(Title:" +
                " name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + durationMin + ")\n";
    }
}
