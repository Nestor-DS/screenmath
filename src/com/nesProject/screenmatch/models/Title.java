package com.nesProject.screenmatch.models;

public class Title {
    // Variables
    private String name;
    private int releaseDate;
    private int durationMin;
    private boolean includedInPlan;
    private double sumEvaluation;
    private int total;

    // Getters and Setters

    public java.lang.String getName() { // GetName
        return name;
    }
    public void setName(java.lang.String name) { // SetName
        this.name = name;
    }
    public int getReleaseDate() { // GetRelease
        return releaseDate;
    }
    public void setReleaseDate(int releaseDate) { // SetRelease
        this.releaseDate = releaseDate;
    }

    public int getDurationMin() { // GetDuration
        return durationMin;
    }
    public void setDurationMin(int durationMin) { // SetDuration
        this.durationMin = durationMin;
    }


    public boolean isIncludedInPlan() {
        return includedInPlan;
    }
    public void setIncludedInPlan(boolean includedInPlan) { // SetInclude
        this.includedInPlan = includedInPlan;
    }

    public int getTotal(){
        return total;
    }

    // Functions

    public void sampleTechnicalSheet(){
        System.out.println("""
                The name of the movie is %s released in %d with a duration of %d minutes
                """.formatted(name, releaseDate, durationMin));
    }

    public void valoration(double note){
        sumEvaluation += note;
        total++;
    }

    public double mindCalule(){
        return sumEvaluation/total;
    }

}
