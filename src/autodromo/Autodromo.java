
package autodromo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Autodromo {
    public static void main(String[] args) {
        Pista p;
        try {
            p = new Pista();
            p.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Autodromo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
