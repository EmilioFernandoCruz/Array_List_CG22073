import java.util.ArrayList;

public class Ejercicio11 {
    public static void main(String[] args) {
    
        ArrayList<String> pokedex = new ArrayList<>();
        pokedex.add("Pikachu");
        pokedex.add("Charizard");
        pokedex.add("Bulbasaur");
        pokedex.add("Squirtle");
        pokedex.add("Jigglypuff");

        invertirArrayList(pokedex);

        System.out.println("Lista de Pokemones Invertidos:");
        for (String pokemon : pokedex) {
            System.out.println("\"" + pokemon + "\"");
        }
    }

    public static void invertirArrayList(ArrayList<String> listado) {
        int ladoizquierda = 0;
        int ladoderecha = listado.size() - 1;

        while (ladoizquierda < ladoderecha) {
            String temp = listado.get(ladoizquierda);
            listado.set(ladoizquierda, listado.get(ladoderecha));
            listado.set(ladoderecha, temp);
            ladoizquierda++;
            ladoderecha--;
        }
    }
}
