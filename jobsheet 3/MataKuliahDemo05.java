import java.util.Scanner;

public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));

            System.out.print("Kode  : ");
            kode = sc05.nextLine();

            System.out.print("Nama  : ");
            nama = sc05.nextLine();

            System.out.print("SKS   : ");
            dummy = sc05.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam : ");
            dummy = sc05.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMataKuliah[i] = new MataKuliah05(kode, nama, sks, jumlahJam);
            System.out.println("---------------------------------");
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("---------------------------------");
        }

        sc05.close();
    }
}
