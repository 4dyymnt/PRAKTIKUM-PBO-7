/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasi.matematika;

/**
 *
 * @author HP
 */
public class OperasiMatematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 22;
        int y = 33;
        
        int penjumlahan = x + y, pengurangan = x - y, perkalian = x * y;
        double pembagian = (double)x/y;
        
        System.out.println("x + y = " + penjumlahan);
        System.out.println("x - y = " + pengurangan);
        System.out.println("x * y = " + perkalian);
        System.out.println("x : y = " + pembagian);



        
    }
    
}