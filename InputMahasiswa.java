import java.util.Scanner;

public class InputMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.println("\nMahasiswa ke-" + (i+1));
            System.out.print("Nama : ");
            nama[i] = sc.nextLine();

            System.out.print("Nilai : ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\n====================================");
        System.out.println("        Daftar Nilai Mahasiswa      ");
        System.out.println("====================================");
        System.out.println("No\tNama\t\tNilai\tStatus");

        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + "\t" + nama[i] + "\t\t" + nilai[i] + "\t" + status[i]);
        }
    }
}
