class Worker extends Thread {

    private String nama;

    public Worker(String nama){
        this.nama = nama;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(nama + " bekerja... langkah " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){}
        }
    }
}

public class KelasThread {
    public static void main(String[] args) {

        Worker w1 = new Worker("Thread A");
        Worker w2 = new Worker("Thread B");

        w1.start();
        w2.start();
    }
}
