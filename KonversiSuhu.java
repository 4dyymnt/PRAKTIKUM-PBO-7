/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.suhu;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai suhu: ");
            double suhu = scanner.nextDouble();
            System.out.print("Pilih unit (C untuk Celsius, F untuk Fahrenheit, R untuk Reamur): ");
            String unit = scanner.next().toUpperCase();
            double celsius = 0, fahrenheit = 0, reamur = 0;
            // Konversi berdasarkan unit input
            switch (unit) {
                case "C":
                    celsius = suhu;
                    fahrenheit = (celsius * 9.0 / 5.0) + 32;
                    reamur = celsius * 4.0 / 5.0;
                    break;
                case "F":
                    celsius = (suhu - 32) * 5.0 / 9.0;
                    fahrenheit = suhu;
                    reamur = celsius * 4.0 / 5.0;
                    break;
                case "R":
                    celsius = suhu * 5.0 / 4.0;
                    fahrenheit = (celsius * 9.0 / 5.0) + 32;
                    reamur = suhu;
                    break;
                default:
                    System.out.println("Unit tidak valid! Gunakan C, F, atau R.");
                    return; // Output hasil konversi
            }
            System.out.printf("Celsius: %.2f °C\n", celsius);
            System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
            System.out.printf("Reamur: %.2f °R\n", reamur);
        }
    }
}