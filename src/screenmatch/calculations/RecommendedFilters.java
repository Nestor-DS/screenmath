package screenmatch.calculations;

public class RecommendedFilters {
    public void filter(Clasification clasification){
        if(clasification.getClasification() >= 4){
            System.out.println("The best evaluate :)");
        } else {
            System.out.println("It's not very good");
        }
    }
}
