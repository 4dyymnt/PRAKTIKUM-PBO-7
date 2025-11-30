class Kasir {
    int harga, jumlah;
    double diskon;

    Kasir(int harga){
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    Kasir(int harga, int jumlah){
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    Kasir(int harga, int jumlah, double diskon){
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    double total(){
        double total = harga * jumlah;
        return total - (total * diskon);
    }
}

public class Testkasir {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        Kasir k2 = new Kasir(5000, 3);
        Kasir k3 = new Kasir(20000, 2, 0.1);

        System.out.println(k1.total());
        System.out.println(k2.total());
        System.out.println(k3.total());
    }
}