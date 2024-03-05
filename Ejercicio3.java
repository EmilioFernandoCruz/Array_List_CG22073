import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ArrayList de Strings
        ArrayList<String> miPokebola = new ArrayList<>();
        miPokebola.add("Charizard, Bulbasaur, Squirtle, Jigglypuff");
       
        String introducirPokemon = "Pikachu";

        // Insertar el nuevo Pokémon en la primera posición
        miPokebola.add(0, introducirPokemon);

        // Imprimir la lista después de la inserción
        System.out.println("Lista después de la inserción:");
        for (String pokemon : miPokebola) {
            System.out.println("\"" + pokemon + "\"");
        }
    }
}

