import java.util.ArrayList;

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int index1 = 0;
        int index2 = 4;

        intercambiarpokemones(nombresPokemon, index1, index2);
        System.out.println("Lista después del intercambio:");
        int var = 0;
        while (var < nombresPokemon.size()) {
            System.out.println(nombresPokemon.get(var));
            var++;
        }
    }
    public static void intercambiarpokemones(ArrayList<String> listado, int index1, int index2) {
        String temp = listado.get(index1);
        listado.set(index1, listado.get(index2));
        listado.set(index2, temp);
    }
}
