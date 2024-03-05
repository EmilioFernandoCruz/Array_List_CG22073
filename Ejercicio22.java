import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio22 {
    public static void main(String[] args) {
    
        ArrayList<String> pokeNav = new ArrayList<>();
        pokeNav.add("Pikachu");
        pokeNav.add("Charizard");
        pokeNav.add("Bulbasaur");
        pokeNav.add("Squirtle");
        pokeNav.add("Jigglypuff");
        pokeNav.add("Eevee");
        pokeNav.add("Mewtwo");
        pokeNav.add("Gyarados");
        pokeNav.add("Snorlax");
        pokeNav.add("Vulpix");

        StringBuilder mensaje = new StringBuilder("Pokemones del ArrayList y sus lugares:\n");
        int var = 0;
        do {
            mensaje.append("Lugar ").append(var).append(": ").append(pokeNav.get(var)).append("\n");
            var++;
        } while (var < pokeNav.size());

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
