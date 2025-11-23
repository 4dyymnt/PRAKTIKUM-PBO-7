// Kelas induk Civitas
class Civitas {
    protected String nama;
    protected String status;
    
    // Konstruktor
    public Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }
    
    // Method untuk menampilkan data umum
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Status Civitas Akademika: " + status);
    }
}

// Kelas turunan Dosen
class Dosen extends Civitas {
    private String nip;  // Nomor Induk Pegawai
    
    public Dosen(String nama, String nip) {
        super(nama, "Dosen Fakultas Teknik");
        this.nip = nip;
    }
    
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("NIP: " + nip);
        System.out.println();
    }
}

// Kelas turunan Mahasiswa
class Mahasiswa extends Civitas {
    private String nim;  // Nomor Induk Mahasiswa
    private String jurusan;
    
    public Mahasiswa(String nama, String nim, String jurusan) {
        super(nama, "Mahasiswa Fakultas Teknik");
        this.nim = nim;
        this.jurusan = jurusan;
    }
    
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println();
    }
}

// Kelas turunan Staff
class Staff extends Civitas {
    private String idStaff;
    private String jabatan;
    
    public Staff(String nama, String idStaff, String jabatan) {
        super(nama, "Staff Fakultas Teknik");
        this.idStaff = idStaff;
        this.jabatan = jabatan;
    }
    
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("ID Staff: " + idStaff);
        System.out.println("Jabatan: " + jabatan);
        System.out.println();
    }
}

public class StatusCivitas {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen = new Dosen("Dr, Tarmin ST", "123456789");
        
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Risman Suhtia MMpd", "20210001", "Teknik Informatika");
        
        // Membuat objek Staff
        Staff staff = new Staff("Dr Nanang Suherman ST ", "STF001", "Administrasi");
        
        // Menampilkan data masing-masing
        System.out.println("=== Data Civitas Akademika Fakultas Teknik ===");
        dosen.tampilkanData();
        mahasiswa.tampilkanData();
        staff.tampilkanData();
    }
}