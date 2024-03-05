import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String Pokemonviejo = "Charizard";
        String nuevoPokemon = "Dragonite";

        int i = nombresPokemon.indexOf(Pokemonviejo);

        if (i != -1) {

            nombresPokemon.set(i, nuevoPokemon);
        }

        System.out.println("Lista después de la actualización:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}
