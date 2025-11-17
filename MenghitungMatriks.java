import java.util.Scanner;

public class MenghitungMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks = new int[baris][kolom];

        System.out.println("\nMasukkan elemen matriks:");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print("M[" + i + "][" + j + "] = ");
                matriks[i][j] = sc.nextInt();
            }
        }

        int jumlah = 0;
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                jumlah += matriks[i][j];
            }
        }

        System.out.println("\nJumlah seluruh elemen matriks = " + jumlah);
    }
}
