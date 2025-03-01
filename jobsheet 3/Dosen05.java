public class Dosen05 {
    private String kode;
    private String nama;
    private boolean jenisKelamin;
    private int usia;

    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama;
    }
    
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    
    public int getUsia() {
        return usia;
    }
    

    public Dosen05(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo(int nomor) {
        System.out.println("Data Dosen ke-" + nomor);
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia   : " + usia);
        System.out.println("---------------------------------");
    }
}
