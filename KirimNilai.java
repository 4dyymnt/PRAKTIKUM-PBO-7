class HitungRata {
    int[] data;

    HitungRata(int[] data){
        this.data = data;
    }

    double rata(){
        int total = 0;
        for(int i : data){
            total += i;
        }
        return total / (double) data.length;
    }
}

public class KirimNilai {
    public static void main(String[] args) {
        int[] nilai = {80, 90, 75, 85};

        HitungRata h = new HitungRata(nilai);

        double r = h.rata();
        System.out.println("Rata-rata = " + r);
    }
}