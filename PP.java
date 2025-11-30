class PersegiPanjang {
    int p, l;

    PersegiPanjang(int p, int l){
        this.p = p;
        this.l = l;
    }

    int luas(){
        return p * l;
    }
}

public class PP {
    static int hitungLuasHitam(PersegiPanjang luar, PersegiPanjang dalam){
        return luar.luas() - dalam.luas();
    }

    public static void main(String[] args) {
        PersegiPanjang luar = new PersegiPanjang(10, 8);
        PersegiPanjang dalam = new PersegiPanjang(8, 5);

        System.out.println("Luas hitam = " + hitungLuasHitam(luar, dalam));
    }
}