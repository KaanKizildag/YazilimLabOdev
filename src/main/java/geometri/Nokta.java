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
public class Nokta {

    private int x;
    private int y;

    public Nokta() {

    }

    public Nokta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Nokta nokta = (Nokta) obj;
        return this.x == nokta.getX()
                || this.x == nokta.getY()
                || this.y == nokta.getX()
                || this.y == nokta.getY();
    }

}
