/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persamaaan.kuadrat;

/**
 *
 * @author USER
 */
public class PersamaaanKuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Deklarasi variabel dengan nilai yang diberikan
        int a = 2;  // Koefisien a
        int b = 10; // Koefisien b
        int c = 5;  // Koefisien c
        
        // Hitung diskriminan (D) dengan rumus b² - 4ac
        int diskriminan = (b * b) - (4 * a * c);
        
        // Tampilkan hasil
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Diskriminan (D = b² - 4ac) = " + diskriminan);
        
        // Interpretasi sederhana (opsional)
        if (diskriminan > 0) {
            System.out.println("Diskriminan positif: Ada dua akar real yang berbeda.");
        } else if (diskriminan == 0) {
            System.out.println("Diskriminan nol: Ada satu akar real (ganda).");
        } else {
            System.out.println("Diskriminan negatif: Tidak ada akar real (akar imajiner).");

    }
    
}
