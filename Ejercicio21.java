import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio21 {
    public static void main(String[] args) {
       
        ArrayList<String> pokebola = new ArrayList<>();
        pokebola.add("Pikachu");
        pokebola.add("Charizard");
        pokebola.add("Bulbasaur");
        pokebola.add("Squirtle");
        pokebola.add("Jigglypuff");

        String nuevoPokemon = "Venusaur";

        
        int index = 1; 
        pokebola.set(index, nuevoPokemon);

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Pokebola, después de reemplazar al segundo Pokemon:\n");
        int var = 0;
        while (var < pokebola.size()) {
            mensaje.append("\"").append(pokebola.get(var)).append("\"\n");
            var++;
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}

