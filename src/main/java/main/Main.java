/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import geometri.Cizgi;
import geometri.Dortgen;
import geometri.Geometri;
import geometri.Nokta;
import geometri.Ucgen;
import java.util.List;

/**
 *
 * @author kaan
 */
public class Main {

    public static void main(String[] args) {
        
        Geometri geometri = new Geometri();
        Cizgi cizgi1 = new Cizgi(new Nokta(1, 2), new Nokta(4, 3));
        Cizgi cizgi2 = new Cizgi(new Nokta(5, 6), new Nokta(1, 2));
        Cizgi cizgi3 = new Cizgi(new Nokta(12, 1), new Nokta(5, 6));
        Cizgi cizgi4 = new Cizgi(new Nokta(4, 2), new Nokta(12, 1));
        
        Ucgen ucgen = new Ucgen(cizgi1, cizgi2, cizgi3);
        Dortgen dortgen = new Dortgen(cizgi1, cizgi2, cizgi3, cizgi4);
        System.out.println("üçgen misin: " + ucgen.sekilMisin(List.of(cizgi1, cizgi2, cizgi3)));
        
        System.out.println("dortgen misin: " + dortgen.sekilMisin(List.of(cizgi1, cizgi2, cizgi3)));

//        System.out.println("Paralel: " +geometri.paralel(cizgi1, cizgi2));
//        System.out.println("Kesişir: " + geometri.kesisen(cizgi1, cizgi2));
//        System.out.println("Eşkenar mı: " + ucgen.eskenar());
//        System.out.println("ikizkenar mı: " + ucgen.ikizkenar());
        // System.out.println("ucgenAlan: " + ucgen.alan(15, 2));
    }
}
