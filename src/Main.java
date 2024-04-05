import com.nesProject.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Matrix");
        myMovie.setReleaseDate(2002);
        myMovie.setDurationMin(129);
        myMovie.setIncludedInPlan(true);

        System.out.println(myMovie.getName());
//        myMovie.sampleTechnicalSheet();
        myMovie.valoration(10);
        myMovie.valoration(8);
        System.out.println("Valoration: "+myMovie.mindCalule());
        System.out.println("Total: "+ myMovie.getTotal());
    }
}
