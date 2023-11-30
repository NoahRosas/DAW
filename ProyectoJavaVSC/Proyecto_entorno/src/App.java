import java.util.Random;
import javax.swing.JFrame;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {
        Random rng = new Random();
       // NewJFrame nf = new newJFrame();
        String nombre[]={"Piedra", "Papel", "Tijera"};
        int datoRandom = rng.nextInt(nombre.length);
        System.out.println(nombre[datoRandom]);
        /*nf.setVisible(true);
        nf.setLocationRelativeTo(null);
        nf.setSide(300,300);*/
            for(int i = 0; i<nombre.length; i++){
                System.out.print(nombre[i]);
        }
    }
}
