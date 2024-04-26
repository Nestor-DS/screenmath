package com.nesProject.screenmatch.calculations;

import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }
//
//    public void include(Title title){
//        this.totalTime += title.getDurationMin();
//    }

    public void include(Title title){
        System.out.println("Agregando duración en minutos de: "+title);
        this.totalTime += title.getDurationMin();

    }

}
