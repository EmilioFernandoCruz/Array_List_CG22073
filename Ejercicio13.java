import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio13 {
    public static void main(String[] args) {
      
        ArrayList<String> pokebola1 = new ArrayList<>();
        pokebola1.add("Pikachu");
        pokebola1.add("Charizard");
        pokebola1.add("Bulbasaur");

        ArrayList<String> pokebola2 = new ArrayList<>();
        pokebola2.add("Bulbasaur");
        pokebola2.add("Squirtle");
        pokebola2.add("Jigglypuff");

        Collections.sort(pokebola1); Collections.sort(pokebola2);

        boolean identicos = pokebola1.equals(pokebola2);

        if (identicos) {
            System.out.println("¿Los conjuntos de Pokémon son iguales? Sí");
        } else {
            System.out.println("¿Los conjuntos de Pokémon son iguales? No");
        }
    }
}
