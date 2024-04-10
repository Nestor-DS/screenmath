package com.nesProject.screenmatch.models;

public class Title {
    // Variables
    private String name;
    private int releaseDate;
    private int durationMin;
    private boolean includedInPlan;
    private double sumEvaluation;
    private int totalEvaluations;

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

    public boolean isIncludedInPlan(){
        return includedInPlan;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setDurationMin(int durationMin){
        this.durationMin = durationMin;
    }
    public void setIncludedInPlan(boolean includedInPlan){
        this.includedInPlan = includedInPlan;
    }
    public int getTotalEvaluations(){
        return totalEvaluations;
    }

    // Functions

    public void sampleTechnicalSheet(){
        System.out.println("""
                The name of the movie is %s released in %d with a duration of %d minutes
                """.formatted(name, releaseDate, getDurationMin()));
    }

    public void valoration(double note){
        sumEvaluation += note;
        totalEvaluations++;
    }

    public double mindCalule(){
        return sumEvaluation / totalEvaluations;
    }

}
