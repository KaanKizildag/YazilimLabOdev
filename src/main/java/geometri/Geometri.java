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
public class Geometri {

    /* Bu class'da kodlaman gereken fonksiyonlar:
        - paralel(cizgi1, cizgi2) iki cizginin birbirine paralel olup olmadigini kontrol eder. +
        - kesisen(cizgi1, cizgi2) iki cizginin kesisen bir noktasi olup olmadigini kontrol eder. +
        - eskenar(ucgen1) eskenar ucgen olup olmadigini kontrol eder. +
        - ikizkenar(ucgen1) ikizkenar ucgen olup olmadigini kontrol eder. +
        - kare(dortgen1) kare olup olmadigini kontrol eder. + 
        - dikgortgen(dortgen1) dikdortgen olup olmadigini kontrol eder. +
        - ayniMi(... , ...) verilen 2 nesnenin ayni olup olmadigini kontrol eder. +
        - alan(...) verilen nesnenin alanini hesaplar. +
     */

    public boolean paralel(Cizgi cizgi1, Cizgi cizgi2) {
        return cizgi1.egimHesapla() == cizgi2.egimHesapla();
    }

    public boolean kesisen(Cizgi cizgi1, Cizgi cizgi2) {
        // paralel değilse kesişir.
        return !this.paralel(cizgi1, cizgi2);
    }

    public boolean eskenar(Ucgen ucgen) {
        return ucgen.eskenar();
    }

    public boolean ikizkenar(Ucgen ucgen) {
        return ucgen.ikizkenar();
    }

    public boolean kare(Dortgen dortgen) {
        return dortgen.kare();
    }

    public boolean dikdortgen(Dortgen dortgen) {
        return dortgen.dikdortgen();
    }

    // Şekil sınıfı Üçgen ve Dikdörtgenin ortak özelliklerini
    // tutuğum bir sınıf.
    public boolean ayni(Sekil sekil, Sekil sekil2) {
        return sekil.ayni(sekil2);
    }

    public float alan(Sekil sekil) {
        return sekil.alan();
    }

}
