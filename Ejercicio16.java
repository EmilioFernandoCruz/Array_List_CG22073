import java.util.ArrayList;

public class Ejercicio16 {
    public static void main(String[] args) {
        // ArrayList original de equipos de la Champions League
        ArrayList<String> Champions = new ArrayList<>();
        Champions.add("AC Milan");
        Champions.add("Barcelona");
        Champions.add("Real Madrid");
        Champions.add("Manchester City");
        Champions.add("Ajax");

        ArrayList<String> equiposClonados = new ArrayList<>();
        int var1 = 0;
        while (var1 < Champions.size()) {
            equiposClonados.add(Champions.get(var1));
            var1++;
        }

        // Imprimir el ArrayList clonado
        System.out.println("Equipos clonados de la Champions League:");
        int var2 = 0;
        while (var2 < equiposClonados.size()) {
            System.out.println(equiposClonados.get(var2));
            var2++;
        }
    }
}
