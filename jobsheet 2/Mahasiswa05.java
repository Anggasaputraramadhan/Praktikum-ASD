public class Mahasiswa05 {
    private String nim;
    private String nama;
    private String kelas = "TI 1B";
    private double ipk;

    public Mahasiswa05(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }

    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
        System.out.println("Kelas telah diubah menjadi: " + kelas);
    }

    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
        System.out.println("IPK telah diperbarui menjadi: " + ipk);
    }

    public String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }

    public static void main(String[] args) {
        Mahasiswa05 mhs = new Mahasiswa05("2205005", "Ahmad", 3.7);
        mhs.tampilkanInformasi();
        mhs.ubahKelas("TI 2B");
        mhs.updateIpk(3.2);
        
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja(mhs.ipk));
    }
}
