
package autodromo;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author 
 */
public class Lienzo extends JPanel{
    private int pista[][]={{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//1
                           {0,1,1,1,1,1,1,1,1,1,1,1,3,4,3,1,1,1,1,1,1,1,1,1,1,1,0},//2
                           {0,1,1,1,1,1,1,1,1,1,1,1,4,3,4,1,1,1,1,1,1,1,1,1,1,1,0},//3
                           {0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0},//4
                           {0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,1,0},//5
                           {0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,1,0},//6
                           {0,1,1,1,1,1,1,1,1,1,1,2,0,0,0,2,1,1,1,1,1,1,1,1,1,1,0},//7
                           {0,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,0},//8
                           {0,1,1,1,1,1,1,1,1,1,1,2,0,0,0,2,1,1,1,1,1,1,1,1,1,1,0},//9
                           {0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0},//10
                           {0,1,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0},//11
                           {0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0},//12
                           {0,1,1,1,1,1,1,1,1,1,1,1,4,3,4,1,1,1,1,1,1,1,1,1,1,1,0},//13
                           {0,1,1,1,1,1,1,1,1,1,1,1,3,4,3,1,1,1,1,1,1,1,1,1,1,1,0},//14
                           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};//15
    Autos a[]=new Autos[12];                                                              //Arreglo de la cantidad de cuadritos o el tren
    PasarCarro pc;
    PintarPista p;
    
    public Lienzo() throws FileNotFoundException, IOException{                            //Colores de los trenes primero el verde
        pc=new PasarCarro();
        p=new PintarPista(Color.decode("#382C78"), pista);
        int velocidadVerde = 480;
        int velocidadVerde2 = 500;
        
        a[0]=new Autos(this, Color.decode("#51FF00"), 50, 550, 650,1,pc,1);               //Color verde
        a[1]=new Autos(this, Color.decode("#51FF00"), 50, 550, 650,1,pc,2);
        a[2]=new Autos(this, Color.decode("#51FF00"), 50, 550, 650,1,pc,3);
        a[3]=new Autos(this, Color.decode("#F9EB29"), 50, 550, 650,1,pc,4);
       // a[4]=new Autos(this, Color.decode("#51FF00"), 50, 550, 650,1,pc,5);
        
         a[4]=new Autos(this, Color.GREEN, velocidadVerde, 650, 100,2,pc,1);
        a[5]=new Autos(this, Color.decode("#5DC5C7"), 50, 550, 50,2,pc,2);                //Color azul
        a[6]=new Autos(this, Color.decode("#5DC5C7"), 50, 550, 50,2,pc,3);
        a[7]=new Autos(this, Color.decode("#F9EB29"), 50, 550, 50,2,pc,4);
        //a[8]=new Autos(this, Color.decode("#F9EB29"), 50, 550, 50,2,pc,5);
       // a[9]=new Autos(this, Color.decode("#5DC5C7"), 50, 550, 50,2,pc,5);
        
          a[8]=new Autos(this, Color.RED, velocidadVerde, 650, 100,1,pc,1);
        a[9]=new Autos(this, Color.decode("#F3030B"), 50, 550, 50,1,pc,2);                //Color X( poner aparte los otros dos trenes de cada lado)
        a[10]=new Autos(this, Color.decode("#F3030B"), 50, 550, 50,1,pc,3);
        a[11]=new Autos(this, Color.decode("#F3030B"), 50, 550, 50,1,pc,4);
        //a[12]=new Autos(this, Color.decode("#F3030B"), 50, 550, 50,2,pc,5);
        
       
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
    }
     
    public synchronized void paintComponent(Graphics g){
    super.paintComponent(g);
    for (int i = 0; i < a.length; i++) {
            a[i].dibuja(g);
        }
    p.dibuja(g);
    }
     public synchronized int[][] getPista() {
        return pista;
    }

    public synchronized void setPista(int[][] pista) {
        this.pista = pista;
    }
}
