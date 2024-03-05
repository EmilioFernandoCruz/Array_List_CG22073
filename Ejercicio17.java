import java.util.ArrayList;

public class Ejercicio17 {
    public static void main(String[] args) {
       
        ArrayList<String> PremierLeague = new ArrayList<>();
        PremierLeague.add("Manchester City");
        PremierLeague.add("Liverpool");
        PremierLeague.add("Chelsea");
        PremierLeague.add("Arsenal");
        PremierLeague.add("Tottenham");

        PremierLeague.clear();

        System.out.println("¿El ArrayList de equipos de la Premier League está vacío? " + PremierLeague.isEmpty());
    }
}
