import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ArrayList de Strings
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Elemento a buscar
        String elementoDeseado = "Squirtle";

      
        boolean lugarencontrado = false;
        int posicion = -1;

        for (int var = 0; var < nombresPokemon.size(); var++) {
            if (nombresPokemon.get(var).equals(elementoDeseado)) {
                lugarencontrado = true;
                posicion = var;
                break; 
            }
        }

   
        if (lugarencontrado) {
            System.out.println("El elemento \"" + elementoDeseado + "\" se encontró en la posición " + posicion);
        }
    }
}
