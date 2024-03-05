import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio20 {
    public static void main(String[] args) {

        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");

        int nuevaCapacidad = 5;

        while (nombresPokemon.size() < nuevaCapacidad) {
            nombresPokemon.add(null);
        }

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Lista Aumentada:\n");
        for (String pokemon : nombresPokemon) {
            mensaje.append(pokemon).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
