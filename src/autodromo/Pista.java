
package autodromo;

import java.io.IOException;
import javax.swing.JFrame;
/**
 *
 * @author 
 */
public class Pista extends JFrame{
    
    public Pista() throws IOException{
        this.setTitle("                                                            " + "              Pista ");
        this.setSize(1366, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lienzo l=new Lienzo();
         add(l);   
     }
}
