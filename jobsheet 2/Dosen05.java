public class Dosen05 {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    public Dosen05(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " tahun");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    public int hitungMasaKerja(int tahunSaatIni) {
        return tahunSaatIni - tahunBergabung;
    }

    public void ubahKeahlian(String bidangKeahlianBaru) {
        this.bidangKeahlian = bidangKeahlianBaru;
    }
}
