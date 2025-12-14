
package praktikum;
public class Main {
    public static void main(String[] args){
        Bentuk b = new Persegi(4);
        System.out.println("Luas Persegi: "+b.luas());
        Universitas u = new UniversitasCianjur();
        u.tampilData();
        Kendaraan m = new Mobil("Avanza","Darat");
        m.informasi();
    }
}
