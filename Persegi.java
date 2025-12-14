
package praktikum;
public class Persegi extends Bentuk {
    double sisi;
    public Persegi(double s){ sisi = s; }
    @Override
    public double luas(){ return sisi * sisi; }
}
