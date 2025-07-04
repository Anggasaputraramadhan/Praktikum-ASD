public class Surat05 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat05() {
    }

    public Surat05(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanSurat() {
        System.out.println("ID Surat      : " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas         : " + kelas);
        System.out.println("Jenis Izin    : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi        : " + durasi + " hari");
    }
}
