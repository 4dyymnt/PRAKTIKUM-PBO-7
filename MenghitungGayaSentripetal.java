/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.gaya.sentripetal;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenghitungGayaSentripetal {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input dari pengguna
            System.out.print("Masukkan massa benda (kg): ");
            double M = scanner.nextDouble();

            System.out.print("Masukkan kecepatan benda (m/s): ");
            double v = scanner.nextDouble();

            System.out.print("Masukkan jari-jari lintasan (m): ");
            double r = scanner.nextDouble();

            // Menghitung gaya sentripetal
            double Fc = (M * Math.pow(v, 2)) / r;

            // Menampilkan hasil
            System.out.printf("Gaya sentripetal Fc = %.2f Newton%n", Fc);
        }
    }
}
