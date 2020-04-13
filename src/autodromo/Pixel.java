
package autodromo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 
 */
public class Pixel implements Pinta {

     Color c;
     Color c1;
     Color co;
    private boolean m1=true;
    private boolean m2=true;
    private boolean m3=true;
    private boolean m4=true;
    private boolean m5=true;
    private boolean m6=true;


    public Color getC1() {
        return c1;
    }

    public void setC1(Color c1) {
        this.c1 = c1;
    }

    public boolean isM1() {
        return m1;
    }

    public void setM1(boolean m1) {
        this.m1 = m1;
    }

    public boolean isM2() {
        return m2;
    }

    public void setM2(boolean m2) {
        this.m2 = m2;
    }

    public boolean isM3() {
        return m3;
    }

    public void setM3(boolean m3) {
        this.m3 = m3;
    }

    public boolean isM4() {
        return m4;
    }

    public void setM4(boolean m4) {
        this.m4 = m4;
    }

    public boolean isM5() {
        return m5;
    }

    public void setM5(boolean m5) {
        this.m5 = m5;
    }

    public Color getCo() {
        return co;
    }

    public int[][] getMatPacMan1() {
        return matPacMan1;
    }
     int x=50;
     int y=50;
    int x1=50;
    int y1=50;
    int x2=50;
    int y2=50;
    int y3=0;
    int cont=0;
    int bola=0;

    public int getBola() {
        return bola;
    }

    public void setBola(int bola) {
        this.bola = bola;
    }
    int matPacMan[][];
     int matPacMan1[][];
    public Pixel(Color c,int pc[][]){
        this.c=c;
        matPacMan=pc;
    }
    public Pixel(int pc1[][],Color co){
        this.co=co;
        matPacMan1=pc1;
    }
    public Pixel(Color c1,int x,int y,int x1,int y1,int x2,int y2,int y3){
        this.c1=c1;
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.y3=y3;
    }
    public Pixel(int cont){
        this.cont=cont;
    }

    public int getCont() {
        return cont;
    }

    public Color getC() {
        return c;
    }

    public int[][] getMatPacMan() {
        return matPacMan;
    }
    @Override
        public void dibuja(Graphics g) {
    }
    
}
