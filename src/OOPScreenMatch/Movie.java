package OOPScreenMatch;


public class Movie {
    //atributos
    String name;
    int launchYear;
    int duration;
    private double totalRating;
    private int totalEvaluations;

    //metodos
    public void showData(){
        System.out.println("Nombre de pelicula: "+ name + "\n" +
                "año de lanzamiento: " + launchYear + "\n" +
                "duracion: " + duration);
    }

    public void rate(double rateValue){
        System.out.println("Tu calificacion a esta pelicula: " + rateValue + "/10\n");
        totalRating += rateValue;
        totalEvaluations++;

    }
    public double calculateRatingMedia (){
        return (totalRating) / totalEvaluations;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    public void setTotalEvaluations(int totalEvaluations) {
        this.totalEvaluations = totalEvaluations;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }
}
