import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombresdePokemon = new ArrayList<>();

        nombresdePokemon.add("Pikachu, Charizard, Bulbasaur, Squirtle, Jigglypuff");
       
        System.out.println("Nombres de Pokémon:");
        for (String pokebola : nombresdePokemon) {
            System.out.println(pokebola);
        }
    }
}
