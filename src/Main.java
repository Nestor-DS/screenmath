import com.nesProject.screenmatch.models.Episodes;
import com.nesProject.screenmatch.models.Movie;
import com.nesProject.screenmatch.models.Serie;
import screenmatch.calculations.RecommendedFilters;
import screenmatch.calculations.TimeCalculator;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Matrix");
        myMovie.setReleaseDate(2002);
        myMovie.setDurationMin(129);
        myMovie.setIncludedInPlan(true);

        myMovie.valoration(10);
        myMovie.valoration(8);
        myMovie.valoration(7.8);
        System.out.println("Valoration: "+myMovie.getTotalEvaluations());
        System.out.println("Total: "+ myMovie.mindCalule());

        Serie mySerie = new Serie();
        mySerie.setName("House of the dragon");
        mySerie.setReleaseDate(2022);
        mySerie.setSeasons(7);
        mySerie.setDurationMin(120);
        mySerie.setEpisodesSeason(10);
        mySerie.sampleTechnicalSheet();
        System.out.println(mySerie.getDurationMin());

        Movie newMovie = new Movie();
        newMovie.setName("Batman");
        newMovie.setReleaseDate(1998);
        newMovie.setDurationMin(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(mySerie);
        calculator.include(newMovie);
        System.out.println(" Tiempo nesesario para ver los titulos disponibles:" +
                calculator.getTotalTime() + " minutos");

        RecommendedFilters recommendedFilters = new RecommendedFilters();
        recommendedFilters.filter(myMovie);

        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setName("Targaryen house");
        episode.setSerie(mySerie);
        episode.setTotalViews(50);
        recommendedFilters.filter(episode);
    }
}
