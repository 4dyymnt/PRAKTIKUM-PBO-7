public class Deret {
    static void tampilkan(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] angka = {6, 12, 24, 48, 96};
        tampilkan(angka); 
    }
}