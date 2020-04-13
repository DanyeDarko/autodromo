
package autodromo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class PasarCarro {
    static int val=1;
    static int cont;
    static boolean bol1;
    static boolean bol2;
    static boolean bol3;
    static boolean carros;
    public synchronized void pasan(int numcirc){                                //Cordina los movimientos para que no choquen
        if(cont==0){
                cont=numcirc;
            //System.out.println("se espera el carro "+cont);
            switch(numcirc){
                case 1:
                    bol1=true;
                    bol2=false;
                    break;
                case 2:
                    bol2=true;
                    bol1=false;
                    break;
                case 3:
                    bol2=true;
                    bol3=false;
                    break;
            }   
        }
    }
    public synchronized void despertar(){                                       //Solo se duerme el azul pero no se despierta el verde sigue

        //System.out.println("val "+val);
        
        if(val==3){
            carros = false;
            notifyAll();
            val=1;
            cont=0;
        }
        else{
            carros=true;
            val++;
        }

       
    }
    public synchronized void dormir(int num){                                   //Solo duerme una parte de los hilos de los dos, pero no todos------------->(Correguir)
        carros=true;
        
        // System.out.println("sigue dormido ");
         while( carros == true){
                try {
                    wait();
                } catch (Exception e) {
                }
            }

    }

    public synchronized boolean isBol1() {
        return bol1;
    }

    public synchronized boolean isBol2() {
        return bol2;
    }
    public synchronized boolean isBol3() {
        return bol3;
    }
}
