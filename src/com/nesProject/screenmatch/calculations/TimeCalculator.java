package com.nesProject.screenmatch.calculations;

import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    /**
     * Retrieves the total time.
     * @return The total time.
     */
    public int getTotalTime() {
        return totalTime;
    }

    /**
     * Includes the duration of a title in the total time.
     * @param title The title to include.
     */
    public void include(Title title){
        System.out.println("Adding duration in minutes of: "+title);
        this.totalTime += title.getDurationMin();
    }
}
