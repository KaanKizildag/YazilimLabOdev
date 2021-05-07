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
public class Cizgi {

    private Nokta n1;
    private Nokta n2;

    public Cizgi() {

    }

    public Cizgi(Nokta n1, Nokta n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Nokta getN1() {
        return n1;
    }

    public void setN1(Nokta n1) {
        this.n1 = n1;
    }

    public Nokta getN2() {
        return n2;
    }

    public void setN2(Nokta n2) {
        this.n2 = n2;
    }

    public float egimHesapla() {
        // 1.f ile çarpıyorum çünkü float dönmesini istiyorum.
        return (n1.getY() - n2.getY()) / (n1.getX() - n2.getX()) * 1.0f;
    }

    public float uzunluk() {
        // c = √(a^2 + b^2)
        return (float) Math.sqrt(
                ((Math.pow((n1.getY() - n2.getY()), 2)
                + Math.pow((n1.getX() - n2.getX()), 2)))
        );
    }

    @Override
    public boolean equals(Object obj) {
        Cizgi cizgi = (Cizgi) obj;
        return this.n1.equals(cizgi.n1)
                || this.n1.equals(cizgi.n2)
                || this.n2.equals(cizgi.n1)
                || this.n2.equals(cizgi.n2);
    }

}
