
package autodromo;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author 
 */
public class PintarPista extends Pixel implements Pinta{
    boolean cambiocol=true;
    public PintarPista(Color c, int[][] pc) {
        super(c, pc);
    }
     public void dibuja(Graphics g) {
         matPacMan=super.getMatPacMan();                                        //Tampoco sirve de nada ------------> XD enserio(Checar mas)
        int i=0,j=-60,x,y;
        for ( x = 0; x < 15; x++) {
            i=50;
            j+=50;
                for ( y = 0; y < 27; y++) {
                    if(y==0){ 
                        i-=50;
                    }
                    else{
                        i+=50;
                    }
                    g.setColor(super.getC());
                    if(x<=15){
                        
                        if(matPacMan[x][y]==0){
                            g.fillRect(i, j, 50, 50);
                        }
                        //g.setColor(Color.decode("#F1CE1F"));
                        g.setColor(Color.RED);                                  //Color de la meta, color blanco
                        if(matPacMan[x][y]==4){
                            //g.fillOval(i+20, j+20, 20, 20);
                            g.fillRect(i, j, 50, 50);
                        }
//                        while(cambiocol){
//                        int rand=(int) (Math.random()*9)+1;
//                        switch(rand){
//                            case 1:
//                                g.setColor(Color.decode("#5DC79A"));
//                                break;
//                            case 2:
//                                g.setColor(Color.RED);
//                                break;
//                            case 3:
//                                 g.setColor(Color.BLUE);
//                                break;
//                            case 4:
//                                 g.setColor(Color.CYAN);
//                                break;
//                            case 5:
//                                 g.setColor(Color.GREEN);
//                                break;
//                            case 6:
//                                 g.setColor(Color.PINK);
//                                break;
//                            case 7:
//                                 g.setColor(Color.ORANGE);
//                                break;
//                            case 8:
//                                 g.setColor(Color.YELLOW);
//                                break;
//                            case 9:
//                                 g.setColor(Color.DARK_GRAY);
//                                break;
//                            case 10:
//                                 g.setColor(Color.MAGENTA);
//                                break;
//                        }
//                        }
                        g.setColor(Color.decode("#D420F4"));                    //CUadros del centro color morado
                        if(matPacMan[x][y]==2){
                            //g.fillOval(i+15, j+15, 30, 30);
                            g.drawRect(i, j, 50, 50);
                        }
                        g.setColor(Color.GREEN);                                //El otro lado de la meta, Color verde
                       // g.setColor(Color.decode("#DC0A0A"));
                        if(matPacMan[x][y]==3){
                             g.drawRect(i, j, 50, 50);
                           // g.fillOval(i+5, j+10, 40, 40);
                           //g.fillRect(i, j, 50, 50);
                        }
                        //g.setColor(Color.ORANGE);                             //no sirve para nada, lo quite
                        //g.fillRect(i, j, 50, 50);
//                        g.drawRect(i, j, 50, 50);
//                        g.drawString(i+" x", i+10,j-5);
//                        g.drawString(j+" y", i+10,j+20);
                    }
                }      
        }
    }
}
