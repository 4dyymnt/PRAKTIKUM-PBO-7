import java.util.Scanner;

class MyThread extends Thread {
    private int id;

    public MyThread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Thread ke-" + id + " sedang berjalan...");
    }
}

public class MembuatBanyakThread {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread yang ingin dibuat: ");
        int jumlah = sc.nextInt();

        for(int i = 1; i <= jumlah; i++){
            MyThread t = new MyThread(i);
            t.start();
        }
    }
}
