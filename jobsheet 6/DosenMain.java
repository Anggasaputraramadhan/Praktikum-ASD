import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen daftar = new DataDosen();
        int pilihan;

        do {
            System.out.println("\n=== Menu Data Dosen ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen     : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen     : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jk = sc.nextLine();
                    boolean jenisKelamin = jk.equalsIgnoreCase("L");
                    System.out.print("Usia           : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen d = new Dosen(kode, nama, jenisKelamin, usia);
                    daftar.tambah(d);
                    break;

                case 2:
                    System.out.println("\n== Data Dosen ==");
                    daftar.tampil();
                    break;

                case 3:
                    daftar.sortingASC();
                    System.out.println("\nData setelah diurutkan (ASC - termuda ke tertua):");
                    daftar.tampil();
                    break;

                case 4:
                    daftar.sortingDSC();
                    System.out.println("\nData setelah diurutkan (DSC - tertua ke termuda):");
                    daftar.tampil();
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
