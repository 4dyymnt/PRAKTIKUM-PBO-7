/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldi.saputra.praktikum;

/**
 *
 * @author USER
 */
public class AldiSaputraPraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 5;
        int y;
        
        System.out.println("Nilai awal x: " + x);
        
        // Pre-increment: ++x
        y = ++x;  // x menjadi 6 terlebih dahulu, lalu y = 6
        System.out.println("Pre-increment: y = ++x → x = " + x + ", y = " + y);
        
        x = 5;  // Reset x untuk contoh selanjutnya
        
        // Post-increment: x++
        y = x++;  // y = 5 (nilai lama), lalu x menjadi 6
        System.out.println("Post-increment: y = x++ → x = " + x + ", y = " + y);
    }
    
}
