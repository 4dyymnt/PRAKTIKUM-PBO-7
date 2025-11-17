import java.util.Scanner;

package tugas6aldi;

public class MembangkitkanVariabelArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("=== PROGRAM ARRAY LENGKAP ===");

            // a. Input jumlah elemen
            System.out.print("Masukkan jumlah elemen array: ");
            int n = input.nextInt();

            int[] arr = new int[n];

            // b. Input elemen array
            System.out.println("Masukkan nilai elemen:");
            for (int i = 0; i < n; i++) {
                System.out.print("Elemen ke-" + i + ": ");
                arr[i] = input.nextInt();
            }

            // c. Cari nilai terbesar & terkecil + indeks
            int max = arr[0], min = arr[0];
            int idxMax = 0, idxMin = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    idxMax = i;
                }
                if (arr[i] < min) {
                    min = arr[i];
                    idxMin = i;
                }
            }

            System.out.println("\nNilai terbesar: " + max + " (index " + idxMax + ")");
            System.out.println("Nilai terkecil: " + min + " (index " + idxMin + ")");

            // d. Total & rata-rata
            int total = 0;
            for (int x : arr) total += x;

            double rata = (double) total / n;

            System.out.println("Total elemen: " + total);
            System.out.println("Rata-rata elemen: " + rata);

            // e. Jumlah indeks ganjil (NPM genap)
            int sumGanjil = 0;
            for (int i = 1; i < n; i += 2) {
                sumGanjil += arr[i];
            }

            // f. Jumlah indeks genap (NPM ganjil)
            int sumGenap = 0;
            for (int i = 0; i < n; i += 2) {
                sumGenap += arr[i];
            }

            System.out.println("Jumlah elemen berindeks ganjil (NPM genap): " + sumGanjil);
            System.out.println("Jumlah elemen berindeks genap  (NPM ganjil): " + sumGenap);

            // g. Pengecekan hasil ganjil/genap
            int cek = sumGanjil;  // jika NPM ganjil, ganti jadi sumGenap

            if (cek % 2 == 0)
                System.out.println("Hasil penjumlahan: GENAP");
            else
                System.out.println("Hasil penjumlahan: GANJIL");

            // h. Sorting array dengan multithreading
            Thread sortThread = new Thread(() -> {
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int tmp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = tmp;
                        }
                    }
                }

                System.out.println("\nArray setelah diurutkan:");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
            });

            sortThread.start();
            sortThread.join();

        } catch (Exception e) {
            System.out.println("\nERROR: Input harus berupa angka!");
        }

        System.out.println("\nProgram selesai.");
    }
}
