public class DecisionStatements {
    public static void main(String[] args) {
        String nameMovie = "Bolt";
        int launchDate = 1999;
        boolean availableMovie = true;
        String packagePlanStatus = "normal";

        if (launchDate < 2022) {
            System.out.println("La pelicula "+ nameMovie + " no es reciente");
        }

        if (availableMovie && packagePlanStatus == "plus"){
            System.out.println("La pelicula "+ nameMovie + " esta disponible");
        }else {
            System.out.println("Su plan actual no cubre la pelicula "+nameMovie);
        }
    }
}
