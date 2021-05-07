/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;


/**
 *
 * @author kaan
 */
public class Ucgen extends Sekil {

    private Cizgi c1;
    private Cizgi c2;
    private Cizgi c3;

    public Ucgen() {

    }

    public Ucgen(Cizgi c1, Cizgi c2, Cizgi c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public boolean eskenar() {
        return c1.uzunluk() == c2.uzunluk()
                && c2.uzunluk() == c3.uzunluk();
    }

    public boolean ikizkenar() {
        return c1.uzunluk() == c2.uzunluk()
                || c2.uzunluk() == c3.uzunluk()
                || c1.uzunluk() == c3.uzunluk();
    }

    @Override
    public float alan() {
        // a + b + c = 2u
        float u = (c1.uzunluk() + c2.uzunluk() + c3.uzunluk()) / 2;
        
        float a = c1.uzunluk();
        float b = c2.uzunluk();
        float c = c3.uzunluk();
        
        // √(u(u-a)(u-b)(u-c))
        return Math.round(Math.sqrt(u * (u - a) * (u - b) * (u - c)));
    }

    

}
