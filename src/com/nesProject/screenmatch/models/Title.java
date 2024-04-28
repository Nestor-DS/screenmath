package com.nesProject.screenmatch.models;

import com.nesProject.screenmatch.exceptions.TimeConvertionException;

public class Title implements Comparable <Title>{

    // Variables
    private String name;
    private int releaseDate;

    private int durationMin;
    private boolean includedInPlan;
    private double sumEvaluation;
    private int totalEvaluations;

    public Title(TitleOMDB titleOMDB) {
        this.name = titleOMDB.title();
        this.releaseDate = Integer.valueOf(titleOMDB.year());
        if(titleOMDB.runtime().contains("N/A")){
            throw new TimeConvertionException("No se puedo convertir la duración" +
                    ", porque se encontro un valor N/A");
        }
        this.durationMin = Integer.valueOf(titleOMDB.runtime().substring(0,3).replace(" ",""));
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

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
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

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "(Title:" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + durationMin + ")\n";
    }
}
