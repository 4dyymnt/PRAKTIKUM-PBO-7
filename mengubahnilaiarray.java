package tugas6aldi;


public class mengubahnilaiarray {
    
    public static void main(String[] args) {

        System.out.println("=== UBAH NILAI ARRAY MOBIL ===");

        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Honda";  // nilai baru
                System.out.println("Indeks yang diubah: " + i);
                System.out.println("Nilai baru: " + mobil[i]);
            }
        }
    }
}
