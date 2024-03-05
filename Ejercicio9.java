import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio9 {
    public static void main(String[] args) {
       
        ArrayList<String> aldeadelaHoja = new ArrayList<>();
        aldeadelaHoja.add("Naruto Uzumaki");
        aldeadelaHoja.add("Sasuke Uchiha");
        aldeadelaHoja.add("Sakura Haruno");
        aldeadelaHoja.add("Kakashi Hatake");
        aldeadelaHoja.add("Shikamaru Nara");

        ArrayList<String> shinobi = new ArrayList<>(aldeadelaHoja);

        StringBuilder mensaje = new StringBuilder("Copia del ArrayList de los ninjas de Naruto:\n");
        for (String ninja : shinobi) {
            mensaje.append(ninja).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
