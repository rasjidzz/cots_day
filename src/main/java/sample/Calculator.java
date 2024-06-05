/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author mrisj
 */
public class Calculator {
    private int hasil;
    
    public Calculator(){
        this.hasil = 0;
    }
    
    public void resetHasil(){
        this.hasil = 0;
    }
    
    public void penjumlahan(int bil1, int bil2){
        this.hasil = bil1+bil2;
    }
    
    public void pengurangan(int bil1, int bil2){
        this.hasil = bil1 - bil2;
    }
    
    public void perkalian(int bil1, int bil2){
        this.hasil = bil1 * bil2;
    }
    
    public int getHasil(){
        return this.hasil;
    }
}
