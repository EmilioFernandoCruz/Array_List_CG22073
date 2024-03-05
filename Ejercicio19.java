import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio19 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int nuevoIndex = 3;

        ArrayList<String> ArrayList2 = new ArrayList<>();
        int var = 0;
        while (var < nuevoIndex && var < nombresPokemon.size()) {
            ArrayList2.add(nombresPokemon.get(var));
            var++;
        }
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Lista después de reducir la capacidad:\n");
        for (String pokemon : ArrayList2) {
            mensaje.append("\"").append(pokemon).append("\"\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
