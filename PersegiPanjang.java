
package praktikum;
public class PersegiPanjang extends Bentuk {
    double panjang, lebar;
    public PersegiPanjang(double p, double l){ panjang=p; lebar=l; }
    @Override
    public double luas(){ return panjang * lebar; }
}
