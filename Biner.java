import java.util.Scanner;

public class Biner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        String biner = "";
        while(n > 0){
            biner = (n % 2) + biner;
            n /= 2;
        }

        System.out.println("Biner = " + biner);
    }
}