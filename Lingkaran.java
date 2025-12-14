
package praktikum;
public class Lingkaran extends Bentuk {
    double r;
    public Lingkaran(double r){ this.r=r; }
    @Override
    public double luas(){ return Math.PI * r * r; }
}
