public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah05() {
       
    }

    public MataKuliah05(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK      : " + kodeMK);
        System.out.println("Nama         : " + nama);
        System.out.println("SKS          : " + sks);
        System.out.println("Jumlah Jam   : " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi: " + jumlahJam);
    }

    public void kurangJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Error: Pengurangan lebih besar dari jumlah jam saat ini!");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi: " + jumlahJam);
        }
    }
}
