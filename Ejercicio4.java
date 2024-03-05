import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ArrayList de Strings
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");
        nombresPokemon.add("Eevee");
        nombresPokemon.add("Mewtwo");
        nombresPokemon.add("Gyarados");
        nombresPokemon.add("Snorlax");
        nombresPokemon.add("Vulpix");

        // Índice especificado
        int NumIndice = 2;

        // Recuperar el Pokémon en el índice especificado
        String pokemon = nombresPokemon.get(NumIndice);

        // Imprimir el Pokémon en el índice especificado
        System.out.println("Pokémon en el índice " + NumIndice + ": " + pokemon);
    }
}
