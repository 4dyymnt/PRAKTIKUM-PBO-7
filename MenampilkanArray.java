public class MenampilkanArray {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Cara 1: Perulangan For");
        for(int i = 0; i < age.length; i++){
            System.out.println("Index " + i + " = " + age[i]);
        }

        System.out.println("\nCara 2: Perulangan Foreach");
        for(int a : age){
            System.out.println(a);
        }
    }
}
