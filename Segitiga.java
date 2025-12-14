
package praktikum;
public class Segitiga extends Bentuk {
    double alas, tinggi;
    public Segitiga(double a, double t){ alas=a; tinggi=t; }
    @Override
    public double luas(){ return 0.5 * alas * tinggi; }
}
