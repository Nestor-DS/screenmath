package com.nesProject.screenmatch.calculations;

public class RecommendedFilters {
    /**
     * Filters the classification.
     * @param classification The classification to filter.
     */
    public void filter(Classification classification){
        if(classification.getClassification() >= 4){
            System.out.println("Highly recommended :)");
        } else {
            System.out.println("Not highly recommended");
        }
    }
}
