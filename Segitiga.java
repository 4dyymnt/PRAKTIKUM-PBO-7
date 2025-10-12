/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author USER
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 6.0;  // Alas segitiga
        double b = 8.0;  // Tinggi segitiga (juga sisi kaki kedua)
        
        // Hitung luas (dari soal 5)
        double luas = 0.5 * a * b;
        System.out.println("Luas segitiga dengan alas a = " + a + " dan tinggi b = " + b + " adalah: " + luas);
        
        // Hitung sisi c menggunakan Pythagoras
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Sisi miring c = sqrt(" + a + "^2 + " + b + "^2) = " + c);
        
        // Hitung keliling
        double keliling = a + b + c;
        System.out.println("Keliling segitiga = a + b + c = " + keliling);

    }
    
}
