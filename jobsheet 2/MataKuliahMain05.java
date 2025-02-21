public class MataKuliahMain05 {

    public static void main(String[] args) {
        MataKuliah05 mtklh1 = new MataKuliah05();
        mtklh1.kodeMK = "2325";
        mtklh1.nama = "Pemrograman Java dan struktur data";
        mtklh1.sks = 0;
        mtklh1.jumlahJam = 0;

        System.out.println("Informasi Mata Kuliah 1:");
        mtklh1.tampilInformasi();

        mtklh1.tambahJam(3350);
        mtklh1.ubahSKS(120);

        System.out.println("\nInformasi Mata Kuliah 1 setelah perubahan:");
        mtklh1.tampilInformasi();

        MataKuliah05 mtklh2 = new MataKuliah05("2325", "Pemrograman Java dan struktur data", 2, 6);

        System.out.println("\nInformasi Mata Kuliah 2:");
        mtklh2.tampilInformasi();

        mtklh2.tambahJam(4);
        mtklh2.kurangJam(4);
        mtklh2.ubahSKS(2);

        System.out.println("\nInformasi Mata Kuliah 2 setelah perubahan:");
        mtklh2.tampilInformasi();
    }
}