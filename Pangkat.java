import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan: ");
        int a = sc.nextInt();
        System.out.print("Pangkat: ");
        int b = sc.nextInt();

        int hasil = 1;
        for(int i = 1; i <= b; i++){
            hasil *= a;
        }

        System.out.println(a + "^" + b + " = " + hasil);
    }
}