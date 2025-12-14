
package praktikum;
public class Mobil extends Kendaraan {
    String nama, jenis;
    public Mobil(String n, String j){ nama=n; jenis=j; }
    @Override
    public void informasi(){
        System.out.println("Mobil: "+nama+" ("+jenis+")");
    }
}
