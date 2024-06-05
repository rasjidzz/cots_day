/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajar_cots;

import sample.Calculator;

/**
 *
 * @author mrisj
 */
public class Belajar_cots {

    public static void main(String[] args) {
        System.out.println("Muhammad Risjad Shidqi Febian - COTS - Calculator");
        
        Calculator cal1 = new Calculator();
        
        System.out.println("Nominal awal : " + cal1.getHasil());
        cal1.penjumlahan(5, 5);
        System.out.println("Penjumlahan 5 + 5 = 10, actual : " + cal1.getHasil());
        
        cal1.resetHasil();
        cal1.pengurangan(10, 5);
        System.out.println("Pengurangan 10 - 5 = 5, actual : "+ cal1.getHasil());
        
        cal1.resetHasil();
        cal1.perkalian(10, 2);
        System.out.println("Perkalian 10 * 2 = 20, actual : " + cal1.getHasil());
    }
}
