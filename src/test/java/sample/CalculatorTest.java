/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mrisj
 */
public class CalculatorTest {
  
    @org.junit.jupiter.api.Test
    public void testResetHasil() {
        System.out.println("resetHasil");
        Calculator calcu = new Calculator();
        calcu.penjumlahan(10, 22);
        calcu.resetHasil();
        assertEquals(0, calcu.getHasil());
    }

    @org.junit.jupiter.api.Test
    public void testPenjumlahan() {
        System.out.println("penjumlahan");
        int bil1 = 10;
        int bil2 = 20;
        Calculator calcu = new Calculator();
        calcu.penjumlahan(bil1, bil2);
        assertEquals(30, calcu.getHasil());
    }

    @org.junit.jupiter.api.Test
    public void testPengurangan() {
        System.out.println("pengurangan");
        int bil1 = 100;
        int bil2 = 10;
        Calculator calcu = new Calculator();
        calcu.pengurangan(bil1, bil2);
        assertEquals(90, calcu.getHasil());
    }

    @org.junit.jupiter.api.Test
    public void testPerkalian() {
        System.out.println("perkalian");
        int bil1 = 4;
        int bil2 = 5;
        Calculator instance = new Calculator();
        instance.perkalian(bil1, bil2);
        assertEquals(20, instance.getHasil());
    }

    @org.junit.jupiter.api.Test
    public void testGetHasil() {
        System.out.println("getHasil");
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.getHasil();
        assertEquals(expResult, result);
    }
    
}
