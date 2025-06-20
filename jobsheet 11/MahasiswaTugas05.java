public class MahasiswaTugas05 {
    String nim, nama, keperluan;

    public MahasiswaTugas05(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " | Keperluan: " + keperluan);
    }
}
