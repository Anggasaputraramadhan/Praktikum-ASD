public class DosenMain {
    public static void main(String[] args) {
        Dosen05 dosen1 = new Dosen05("D001", "Dr. Budi Santoso", true, 2010, "Kecerdasan Buatan");
        Dosen05 dosen2 = new Dosen05("D002", "Prof. Siti Aminah", false, 2015, "Jaringan Komputer");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();

        System.out.println("\nMengaktifkan kembali Dosen 2...");
        dosen2.setStatusAktif(true);

        System.out.println("\nMengubah bidang keahlian Dosen 1...");
        dosen1.ubahKeahlian("Pembelajaran Mesin");

        System.out.println("\nInformasi Dosen 1 setelah perubahan:");
        dosen1.tampilInformasi();
        System.out.println("\nInformasi Dosen 2 setelah perubahan:");
        dosen2.tampilInformasi();
    }
}
