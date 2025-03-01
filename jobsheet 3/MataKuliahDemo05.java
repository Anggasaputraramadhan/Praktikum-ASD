import java.util.Scanner;

public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc05.nextInt();
        sc05.nextLine();

        MataKuliah05[] arrayMatkul = new MataKuliah05[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode Mata Kuliah: ");
            String kode = sc05.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            String nama = sc05.nextLine();
            System.out.print("SKS: ");
            int sks = sc05.nextInt();
            System.out.print("Jumlah Jam: ");
            int jumlahJam = sc05.nextInt();
            sc05.nextLine();

            arrayMatkul[i] = new MataKuliah05(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Mata Kuliah yang telah dimasukkan:");
        for (MataKuliah05 matkul : arrayMatkul) {
            matkul.cetakInfo();
        }

        sc05.close();
    }
}
