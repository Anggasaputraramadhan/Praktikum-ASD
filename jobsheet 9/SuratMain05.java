import java.util.Scanner;

public class SuratMain05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        StackSurat05 stackSurat = new StackSurat05(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Surat Izin Mahasiswa ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc05.nextInt();
            sc05.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc05.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc05.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc05.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc05.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc05.nextInt();
                    sc05.nextLine();

                    Surat05 suratBaru = new Surat05(id, nama, kelas, jenis, durasi);
                    stackSurat.push(suratBaru);
                    break;

                case 2:
                    Surat05 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat izin:");
                        diproses.tampilkanSurat();
                    }
                    break;

                case 3:
                    Surat05 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Izin Terakhir:");
                        terakhir.tampilkanSurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = sc05.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}
