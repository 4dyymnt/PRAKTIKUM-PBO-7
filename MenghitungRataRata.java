import java.util.Scanner;

public class MenghitungRataRata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();

        double[] data = new double[n];
        double total = 0;

        System.out.println("\nMasukkan angka:");
        for(int i = 0; i < n; i++){
            try {
                System.out.print("Data ke-" + (i+1) + ": ");
                data[i] = sc.nextDouble();
                total += data[i];

            } catch (Exception e){
                System.out.println("Error! Input harus angka.");
                sc.nextLine();
                i--; 
            }
        }

        double rata = total / n;
        System.out.println("\nRata-rata = " + rata);
    }
}
