import java.util.ArrayList;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int indiceA = 1;
        int indiceB = 4;

        ArrayList<String> parteExtraida = extraerParte(nombresPokemon, indiceA, indiceB);

        System.out.println("Porción extraída:");
        for (String pokemon : parteExtraida) {
            System.out.println(pokemon);
        }
    }

    public static ArrayList<String> extraerParte(ArrayList<String> listado, int inicio, int fin) {
        ArrayList<String> parteExtraida = new ArrayList<>();
        for (int var = inicio; var <= fin; var++) {
            parteExtraida.add(listado.get(var));
        }
        return parteExtraida;
    }
}
