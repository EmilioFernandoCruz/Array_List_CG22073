import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
    
        ArrayList<String> misPokemones = new ArrayList<>();
        misPokemones.add("Pikachu");
        misPokemones.add("Charizard");
        misPokemones.add("Bulbasaur");
        misPokemones.add("Squirtle");
        misPokemones.add("Jigglypuff");

      
        String tercerPokemon = misPokemones.get(2);
        misPokemones.remove(tercerPokemon);

        System.out.println("Lista después de eliminar el tercer elemento:");
        for (String nombre : misPokemones) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}
