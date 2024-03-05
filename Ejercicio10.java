import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<String> pokebola = new ArrayList<>();
        pokebola.add("Pikachu");
        pokebola.add("Charizard");
        pokebola.add("Bulbasaur");
        pokebola.add("Squirtle");
        pokebola.add("Jigglypuff");

        mezclarArrayList(pokebola);

        System.out.println("Lista después de mezclar:");
        for (String pokemon : pokebola) {
            System.out.println("\"" + pokemon + "\"");
        }
    }

    public static <T> void mezclarArrayList(ArrayList<T> listado) {
        Random rand = new Random();
        int a = listado.size();
        for (int var1 = 0; var1 < a; var1++) {
            int var2 = rand.nextInt(a);
           
            T temp = listado.get(var1);
            listado.set(var1, listado.get(var2));
            listado.set(var2, temp);
        }
    }
}

