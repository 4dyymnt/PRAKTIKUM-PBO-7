
package praktikum;
public class KapalLaut extends Kendaraan {
    String nama, jenis;
    public KapalLaut(String n, String j){ nama=n; jenis=j; }
    @Override
    public void informasi(){
        System.out.println("Kapal Laut: "+nama+" ("+jenis+")");
    }
}
