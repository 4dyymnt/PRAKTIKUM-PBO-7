// Superclass Hewan
class Hewan {
    String jenisKaki;
    String contohHewan;

    Hewan(String jenisKaki, String contohHewan) {
        this.jenisKaki = jenisKaki;
        this.contohHewan = contohHewan;
    }

    void tampilkanInfo() {
        System.out.println("Hewan berkaki " + jenisKaki + " : " + contohHewan);
    }
}

// Subclass HewanBerkakiDua
class HewanBerkakiDua extends Hewan {

    HewanBerkakiDua() {
        super("dua", "kangguru, ayam, bebek, dll");
    }
}

// Subclass HewanBerkakiEnam
class HewanBerkakiEnam extends Hewan {

    HewanBerkakiEnam() {
        super("enam", "capung, nyamuk, kupu-kupu, dll");
    }
}

// Subclass HewanBerkakiEmpat
class HewanBerkakiEmpat extends Hewan {

    HewanBerkakiEmpat() {
        super("empat", "kucing, anjing, kuda, dll");
    }
}

// Subclass HewanBerkakiDelapan
class HewanBerkakiDelapan extends Hewan {

    HewanBerkakiDelapan() {
        super("delapan", "kepiting, belalang, laba-laba, dll");
    }
}

public class PewarisanHewan {
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        System.out.println("- Hewan berkaki dua");
        System.out.println("- Hewan berkaki enam");
        System.out.println("- Hewan berkaki empat");
        System.out.println("- Hewan berkaki delapan\n");

        System.out.println("Contoh hewan:");
        Hewan hewanDua = new HewanBerkakiDua();
        hewanDua.tampilkanInfo();

        Hewan hewanEnam = new HewanBerkakiEnam();
        hewanEnam.tampilkanInfo();

        Hewan hewanEmpat = new HewanBerkakiEmpat();
        hewanEmpat.tampilkanInfo();

        Hewan hewanDelapan = new HewanBerkakiDelapan();
        hewanDelapan.tampilkanInfo();
    }
}