import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
     
        ArrayList<String> Pokebola = new ArrayList<>();
        Pokebola.add("Pikachu, Charizard, Bulbasaur, Squirtle, Jigglypuff");
        Pokebola.add(", Eevee, Mewtwo, Gyarados, Snorlax, Vulpix");
       
      
        ArrayList<Integer> num = new ArrayList<>();
        for (int var1 = 1; var1 <= 10; var1++) {
            num.add(var1);
        }

        ArrayList<Character> listLetra = new ArrayList<>();
        for (char var2 = 'A'; var2 <= 'J'; var2++) {
            listLetra.add(var2);
        }
        System.out.println("Nombres de Pokémon:");
        MostrarArrayList(Pokebola);

        System.out.println("\nNúmeros:");
        MostrarArrayList(num);

        System.out.println("\nLetras:");
        MostrarArrayList(listLetra);
    }

    public static <T> void MostrarArrayList(ArrayList<T> listado) {
        for (T i : listado) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
