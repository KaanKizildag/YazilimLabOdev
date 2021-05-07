/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

import java.util.Random;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kaan
 */
public class GeometriTest {

    Geometri geometri = new Geometri();
    Cizgi cizgi1 = new Cizgi(new Nokta(1, 2), new Nokta(4, 3));
    Cizgi cizgi2 = new Cizgi(new Nokta(5, 6), new Nokta(1, 2));
    Cizgi cizgi3 = new Cizgi(new Nokta(12, 1), new Nokta(5, 6));
    Cizgi cizgi4 = new Cizgi(new Nokta(4, 2), new Nokta(12, 1));

    Ucgen ucgen = new Ucgen(cizgi1, cizgi2, cizgi3);
    Dortgen dortgen = new Dortgen(cizgi1, cizgi2, cizgi3, cizgi4);
   

    public GeometriTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of paralel method, of class Geometri.
     */
    @Test
    public void testParalel() {
        System.out.println("paralel");
        Geometri instance = new Geometri();
        boolean beklenen = false;
        boolean sonuc = instance.paralel(cizgi1, cizgi2);
        assertEquals(beklenen, sonuc);
    }

    /**
     * Test of kesisen method, of class Geometri.
     */
    @Test
    public void testKesisen() {
        System.out.println("kesisen");
        Geometri instance = new Geometri();
        boolean expResult = true;
        boolean result = instance.kesisen(cizgi1, cizgi2);
        assertEquals(expResult, result);
    }

    /**
     * Test of eskenar method, of class Geometri.
     */
    @Test
    public void testEskenar() {
        System.out.println("eskenar");
        Geometri instance = new Geometri();
        boolean expResult = false;
        boolean result = instance.eskenar(ucgen);
        assertEquals(expResult, result);
    }

    /**
     * Test of ikizkenar method, of class Geometri.
     */
    @Test
    public void testIkizkenar() {
        System.out.println("ikizkenar");
        Geometri instance = new Geometri();
        boolean expResult = false;
        boolean result = instance.ikizkenar(ucgen);
        assertEquals(expResult, result);
    }

    /**
     * Test of kare method, of class Geometri.
     */
    @Test
    public void testKare() {
        System.out.println("kare");
        Geometri instance = new Geometri();
        boolean expResult = false;
        boolean result = instance.kare(dortgen);
        assertEquals(expResult, result);
    }

    /**
     * Test of dikdortgen method, of class Geometri.
     */
    @Test
    public void testDikdortgen() {
        System.out.println("dikdortgen");
        Geometri instance = new Geometri();
        boolean expResult = true;
        boolean result = instance.dikdortgen(dortgen);
        assertEquals(expResult, result);
    }

    /**
     * Test of ayni method, of class Geometri.
     */
    @Test
    public void testAyni() {
        System.out.println("ayni");
        Geometri instance = new Geometri();
        boolean expResult = false;
        boolean result = instance.ayni(dortgen, ucgen);
        assertEquals(expResult, result);
    }

    /**
     * Test of alan method, of class Geometri.
     */
    @Test
    public void testAlan() {
        System.out.println("alan");
        Geometri instance = new Geometri();
        float expResult = 4; // yuvarladığım için.
        float result = instance.alan(ucgen);
        assertEquals(expResult, result, 0.0);
    }

}
