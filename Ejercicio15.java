import java.util.ArrayList;

public class Ejercicio15 {
    public static void main(String[] args) {
     
        ArrayList<String> primerConjunto = new ArrayList<>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");

        ArrayList<String> segundoConjunto = new ArrayList<>();
        segundoConjunto.add("Squirtle");
        segundoConjunto.add("Jigglypuff");

        int var1 = 0;
        while (var1 < segundoConjunto.size()) {
            primerConjunto.add(segundoConjunto.get(var1));
            var1++;
        }

        System.out.println("Lista resultante después de la unión:");
        int var2 = 0;
        while (var2 < primerConjunto.size()) {
            System.out.println("\"" + primerConjunto.get(var2) + "\"");
            var2++;
        }
    }
}
