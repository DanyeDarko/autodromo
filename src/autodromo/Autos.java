
package autodromo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ebria
 */
public class Autos extends Thread implements Pinta{
    Lienzo l;
    Color c;
    private int vel;
    private int x;
    private int y;
    Color c2;
    private int opc;
    private int num;
    private boolean izquierda;
    private boolean izquierda_2;
    private boolean izquierda_3;
    private boolean derecha;
    private boolean derecha_2;
    private boolean derecha_3;
    private boolean arriba;
    private boolean arriba_2;
    private boolean abajo;
    private boolean abajo_2;
    private boolean abajo_3;
    private boolean aa;
    private boolean bb;
    private  boolean cc;
    private boolean cuadro1;
    private  boolean cuadro2;
    private boolean cuadro3;
    private boolean cuadro4;
    private boolean cuadro5;
    private boolean cuadro6;
    private boolean cuadro7;
    private boolean cuadro8;
    PasarCarro pc;
    public Autos(Lienzo l, Color c, int vel, int x, int y,int opc, PasarCarro pc,int num) {
        this.l = l;
        this.c = c;
        this.pc = pc;         //Tiene toda la informacion de la clase "PasarCarros"
        c2=c;
        this.vel = vel;
        this.x = x;
        this.y = y;
        this.opc = opc;
        izquierda= false;
        izquierda_2= false;
        izquierda_3= false;
        derecha= false;
        derecha_2= false;
        derecha_3= true;
        arriba= false;
        arriba_2= false;
        abajo= false;
        abajo_2= false;
        abajo_3= false;
        aa= true;
        bb= false;
        cc= false;
        cuadro1=false;
        cuadro2=false;
        cuadro3=false;
        cuadro4=false;
        cuadro5=false;
        cuadro6=false;
        cuadro7=false;
        cuadro8=false;
        this.num=num;
        
    }
    public void setC(Color c) {
        this.c = c;
    }
    public void run(){
        int i;
        i=0;
        while(i <= num){
            try {
                //System.out.println("");
                sleep(100);                                                             //velocidad del verde (se pueden hacder hacks mover despues)
                i++;
            } catch (InterruptedException ex) {
               // Logger.getLogger(Autos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while(true){
            try {
                Thread.sleep(vel);
               switch(opc){
                   case 1:                                                                 //Caso 1
                       if(derecha==false){
                            x+=50;
                            //System.out.println("Derecha "+x);
                            if(x>=1250){ 
//                                System.out.println("cont "+cont);
//                                if(cont==5){
                                    derecha=true;
//                                    cont=0;
//                                }
//                               cont++;
                               arriba=true;
                            }
                        }
                        if(arriba==true){
                            if(y>=350){
                                y-=50;
                                if(x==1250 && y==550){
                                    pc.pasan(1);
                                   //System.out.println("paso por aqui el carro");
                                }
                                //System.out.println("arriba "+y);
                            }else{
                                 //izquierda=true;
                                 arriba=false;
                                 cuadro1=true;
                            }
                        }
                        if(cuadro1){
                            if(x>=800){
                                //System.out.println("Izquierda "+x);
                                x-=50;
                            }
                            else{
                                cuadro1=false;
                                cuadro2=true;
                            }
                        }
                        if(cuadro2){
                            //System.out.println("si pasa boleano");
                            if(x<=800 && y<350){
                                //System.out.println("si pasa");
                               y+=50; 
                            }
                            else{
                                cuadro2=false;
                                cuadro3=true;
                            }
                        }
                        if(cuadro3){
                           // System.out.println("si entra boleano");
                            if(x>=600 && y<400){
                                //System.out.println("si entra");
                                x-=50;
                                if(x==600 && y==350){
                                   // System.out.println("despertar aqui carro 2");
                                    
                                    //System.out.println(cont);
                                        pc.despertar();
                                }
                            }
                            else{
                                cuadro3=false;
                                cuadro4=true;
                            }
                        }
                        if(cuadro4){
                            //System.out.println("si entra el boleano");
                            if(x<=600 && y>=350){
                                //System.out.println("si entra ");
                                y-=50;
                            }
                            else{
                                cuadro4=false;
                                izquierda=true;
                            }
                        }
                        if(izquierda==true){
                            if(x>50){
                                //System.out.println("Izquierda "+x);
                                x-=50;
                            }else{
                                abajo=true;
                                izquierda=false;
                               // System.out.println(izquierda);
                            }
                        }
                        if(abajo==true){
                            if(y<650){
                                y+=50;
                               // System.out.println("abajo "+y);
                            }else{
                                derecha=false;
                                abajo=false;

                            }
                        }
                        if(pc.isBol1()){
                            //System.out.println(p.isBol1());
                            if(derecha_3){
                                if(x<=1000 && y>=250){
                                    //System.out.println("aqui entra");
                                    y-=50;
                                    cuadro1=false;

                               }if(x==1000 && y<250){
                                    derecha_3= false;
                                    izquierda_3=true;
                                }
                            }
                            if(izquierda_3){
                               // System.out.println("si entro ldkd");
                                if(x>850 && y<250){
                                    x-=50;
                                    if(x==950 && y==200){
                                        //System.out.println("dormir aqui carro 1");
                                        pc.dormir(num);
                                    }
                                    

                                }else{
                                    izquierda_3=false;
                                    abajo_3=true;
                                }
                            }
             
                       }
                       if (x == 850 && y == 250) {
                           i = 0;
                           while (i <= num) {
                               try {
                                   //System.out.println("");
                                   sleep(100);
                                   i++;
                               } catch (InterruptedException ex) {
                                  // Logger.getLogger(Autos.class.getName()).log(Level.SEVERE, null, ex);
                               }
                           }
                       }
                        if (abajo_3) {
                               //System.out.println("si entro");
                               if (x == 850 && y < 300) {
                                   y += 50;
                                   //izquierda=true;
                               } else {
                                   abajo_3 = false;
                                   //izquierda=true;
                                   cuadro1 = true;
                                   derecha_3 = true;
                                   pc.bol1 = false;
                               }
                           }
                        
                       break;                                                              //Caso 1
                   
                   case 2:                                                                 //Caso 2
                    //carro 2
                       //System.out.println(x+" "+y);
                        if(izquierda_2==false){
                            x-=50;
                            //System.out.println("Derecha "+x);
                            if(x<=50){ 
                               izquierda_2=true;
                               abajo_2=true;
                            }
                        }
                        if(abajo_2==true){
                            if(y<=350){
                                y+=50;
                                if(x==50 && y==250){
                                    pc.pasan(2);
                                }
                                //System.out.println("arriba "+y);
                            }else{
                                 //derecha_2=true;
                                 abajo_2=false;
                                 cuadro5=true;
                            }
                        }
                        if(cuadro5){
                           // System.out.println("si entro el boleano");
                            if(x<=500 && y>350){
                                //System.out.println("si entra");
                                x+=50;
                            }
                            else{
                                cuadro5=false;
                                cuadro6=true;
                            }
                        }
                        if(cuadro6){
                           // System.out.println("si entra el boleano");
                            if(x>=500 && y>=400){
                                y-=50;
                                //System.out.println("si entra ");
                                
                            }
                            else{
                                cuadro6=false;
                                cuadro7=true;
                            }
                        }
                        if(cuadro7){
                            //System.out.println("si entra boleano");
                            if(x<=700 && y>=350){
                                x+=50;
                                if(x==750 && y==350){
                                   // System.out.println("despieta aqui carro 1");
                                    pc.despertar();
                                }
                                //System.out.println("si entra");
                            }
                            else{
                                cuadro7=false;
                                cuadro8=true;
                            }
                        }
                        if(cuadro8){
                            //System.out.println("si entra boleano");
                            if(x<=800 && y<=350){
                                //System.out.println("si entra");
                                y+=50;
                            }
                            else{
                                cuadro8=false;
                                derecha_2=true;
                            }
                        }
                        if(derecha_2==true){
                            if(x<=1200){
                                //System.out.println("Izquierda "+x);
                                x+=50;
                            }else{
                                arriba_2=true;
                                derecha_2=false;
                            }
                            
                        }
                        if(arriba_2==true){
                            if(y>50){
                                y-=50;
                               //System.out.println("abajo "+y);
                            }else{
                                izquierda_2=false;
                                arriba_2=false;
                            }
                        }
                        if(pc.isBol2()){
                            if(aa){
                                if(x>=300 && y<=450){
                                    y+=50;
                                    cuadro5=false;
                                    //derecha_2=false;
                                }if(x==300 && y>450){
                                    aa=false;
                                    bb=true;
                                }
                            }
                            if (bb) {
                                //System.out.println("si entro boleano");
                                if(x<=400 && y>450){
                                    //System.out.println("si entra ");
                                    x+=50;
                                    if(x==350 && y==500){
                                       // System.out.println("dormir aqui carro 2");
                                        pc.dormir(num);
                                    }
                                    
                                    
                                }else{
                                    bb=false;
                                    cc=true;
                                }
                            }
                            
                       }
                       if (x == 450 && y == 450) {
                           i = 0;
                           while (i <= num) {
                               try {
                                  // System.out.println("");
                                   sleep(100);
                                   i++;
                               } catch (InterruptedException ex) {
                                   //Logger.getLogger(Autos.class.getName()).log(Level.SEVERE, null, ex);
                               }
                           }
                       }
                       if (cc) {
                           // System.out.println("si entra ");
                           if (x >= 400 && y > 400) {
                               //System.out.println("si entra ");
                               y -= 50;
                           } else {
                               cc = false;
                               cuadro5 = true;
                               //derecha_2=true;
                               aa = true;
                               pc.bol2 = false;
                           }
                       }
                       
                        
                       break;                                                          //Caso 2
                       
                       case 3:                                                         //Caso 3
                       if (derecha == false) {
                            x += 50;
                            if (x >= 1200 && y == 100) {
                                derecha = true;
                                abajo = true;
                            }
                        }if (abajo == true) {
                            if (y <= 250) {
                                y += 50;
                                if (x == 1250 && y == 250) {
                                    pc.pasan(3);
                                }
                            } else {
                                abajo = false;
                                cuadro1 = true;
                            }
                        }
                        if (cuadro1) {
                            if (x >= 800) {
                                x -= 50;
                            } else {
                                cuadro1 = false;
                                cuadro2 = true;
                            }
                        }

                        if (cuadro2) {
                            if (x <= 800 && y < 350) {
                                y += 50;
                            } else {
                                cuadro2 = false;
                                cuadro3 = true;
                            }
                        }
                        if (cuadro3) {
                            if (x >= 600 && y < 400) {
                                x -= 50;
                                if (x == 600 && y == 350) {
                                    pc.despertar();
                                }
                            } else {
                                cuadro3 = false;
                                cuadro4 = true;
                            }
                        }
                        if (cuadro4) {
                            if (x <= 600 && y >= 350) {
                                y -= 50;
                            } else {
                                cuadro4 = false;
                                izquierda = true;
                            }
                        }
                        if (izquierda == true) {
                            if (x > 100) {
                                x -= 50;
                            } else {
                                arriba = true;
                                izquierda = false;
                            }
                        }
                        if (arriba == true) {
                            if (y > 100) {
                                y -= 50;
                            } else {
                                derecha = false;
                                arriba = false;
                            }
                        }

                        if (pc.isBol3()) {
                            if (derecha_3) {
                                if (x <= 1000 && y >= 250) {
                                    y -= 50;
                                    cuadro1 = false;
                                }
                                if (x == 1000 && y < 250) {
                                    derecha_3 = false;
                                    izquierda_3 = true;
                                }
                            }
                            if (izquierda_3) {
                                if (x > 850 && y < 250) {
                                    x -= 50;
                                    if (x == 900 && y == 200) {
                                        pc.dormir(num);
                                    }
                                } else {
                                    izquierda_3 = false;
                                    abajo_3 = true;
                                }
                            }

                        }
                        if (x == 850 && y == 250) {
                            i = 0;
                            while (i <= num) {
                                try {
                                    sleep(80);
                                    i++;
                                } catch (InterruptedException ex) {
                                }
                            }
                        }
                        if (abajo_3) {
                            if (x == 850 && y < 300) {
                                y += 50;
                            } else {
                                abajo_3 = false;
                                cuadro1 = true;
                                derecha_3 = true;
                                pc.bol3 = false;
                            }
                        }  
                       break;                                                        //Caso 3
               }
            } catch (Exception e) {
            }
            l.repaint();
        }
    }
    public void dibuja(Graphics g) {
                  g.setColor(c);
                  g.fillRect(x, y-10, 40, 40);
    }
    
}
