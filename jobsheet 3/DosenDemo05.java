import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc05.nextInt();
        sc05.nextLine();

        Dosen05[] daftarDosen = new Dosen05[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode   : ");
            String kode = sc05.nextLine();
            
            System.out.print("Nama   : ");
            String nama = sc05.nextLine();
            
            System.out.print("Jenis Kelamin (true = Pria, false = Wanita): ");
            boolean jenisKelamin = sc05.nextBoolean();
            
            System.out.print("Usia   : ");
            int usia = sc05.nextInt();
            sc05.nextLine();

            daftarDosen[i] = new Dosen05(kode, nama, jenisKelamin, usia);

            daftarDosen[i].cetakInfo(i + 1);
        }

        System.out.println("\n=== Daftar Dosen ===");
        for (int i = 0; i < jumlahDosen; i++) {
            daftarDosen[i].cetakInfo(i + 1);
        }

        System.out.println("\n=== Data Semua Dosen ===");
        DataDosen05.dataSemuaDosen(daftarDosen);

        System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        DataDosen05.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n=== Rata-rata Usia Dosen ===");
        DataDosen05.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        DataDosen05.infoDosenPalingTua(daftarDosen);
        DataDosen05.infoDosenPalingMuda(daftarDosen);


        sc05.close();
    }
}
