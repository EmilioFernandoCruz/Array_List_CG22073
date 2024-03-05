import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8 {
    public static void main(String[] args) {
   
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        Collections.sort(nombresPokemon);

        System.out.println("Lista ordenada alfabéticamente:");
        for (String pokemon : nombresPokemon) {
            System.out.println("\"" + pokemon + "\"");
        }
    }
}
