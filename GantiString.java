/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganti.string;

/**
 *
 * @author USER
 */
public class GantiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        // Mengubah a ke lowercase
        String resultA = a.toLowerCase();
        
        // Mengubah b ke uppercase
        String resultB = b.toUpperCase();
        
        // Menampilkan hasil
        System.out.println("String a awal: " + a);
        System.out.println("String a setelah diubah (lowercase): " + resultA);
        System.out.println();
        
        System.out.println("String b awal: " + b);
        System.out.println("String b setelah diubah (uppercase): " + resultB);

    }
    
}
