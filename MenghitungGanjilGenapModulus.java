/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.ganjil.genap.modulus;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenghitungGanjilGenapModulus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Meminta input bilangan dari user
            System.out.print("Masukkan sebuah bilangan bulat: ");
            int bilangan = scanner.nextInt();
            
            // Mengecek apakah bilangan genap atau ganjil menggunakan operator modulus (%)
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan " + bilangan + " adalah genap.");
            } else {
                System.out.println("Bilangan " + bilangan + " adalah ganjil.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
        } finally {
            // Menutup scanner
            scanner.close();
        }
    }
}