import java.util.ArrayList;

public class Ejercicio18 {
    public static void main(String[] args) {
       
        ArrayList<String> PremierLeague = new ArrayList<>();
        PremierLeague.add("Manchester City");
        PremierLeague.add("Liverpool");
        PremierLeague.add("Chelsea");
        PremierLeague.add("Arsenal");
        PremierLeague.add("Tottenham");
        
        if (PremierLeague.isEmpty()) {
            System.out.println("El ArrayList de la Premier League está vacío.");
        } else {
            System.out.println("El ArrayList  de la Premier League no está vacío.");
        }
    }
}
