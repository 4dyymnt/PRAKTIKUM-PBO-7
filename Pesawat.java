
package praktikum;
public class Pesawat extends Kendaraan {
    String nama, jenis;
    public Pesawat(String n, String j){ nama=n; jenis=j; }
    @Override
    public void informasi(){
        System.out.println("Pesawat: "+nama+" ("+jenis+")");
    }
}
