/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

import java.util.List;

/**
 *
 * @author kaan
 */
public class Dortgen extends Sekil {

    private Cizgi c1;
    private Cizgi c2;
    private Cizgi c3;
    private Cizgi c4;

    public Dortgen() {

    }

    public Dortgen(Cizgi c1, Cizgi c2, Cizgi c3, Cizgi c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public Cizgi getC1() {
        return c1;
    }

    public void setC1(Cizgi c1) {
        this.c1 = c1;
    }

    public Cizgi getC2() {
        return c2;
    }

    public void setC2(Cizgi c2) {
        this.c2 = c2;
    }

    public Cizgi getC3() {
        return c3;
    }

    public void setC3(Cizgi c3) {
        this.c3 = c3;
    }

    public Cizgi getC4() {
        return c4;
    }

    public void setC4(Cizgi c4) {
        this.c4 = c4;
    }

    @Override
    public float alan() {
        // ardışık olmayan iki kenarı çarparsam olur diye düşünüyorum =)
        return Math.round(c1.uzunluk() * c3.uzunluk());
    }

    public boolean kare() {
        return c1.uzunluk() == c2.uzunluk()
                && c3.uzunluk() == c4.uzunluk()
                && c4.uzunluk() == c1.uzunluk()
                && this.sekilMisin(List.of(c1, c2, c3, c4));
    }

    public boolean dikdortgen() {
        return this.sekilMisin(List.of(c1, c2, c3, c4));
    }

}
