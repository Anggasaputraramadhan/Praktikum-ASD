
import java.util.Scanner;
public class DosenMain05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        DataDosen05 list = new DataDosen05();

        Dosen05 d1 = new Dosen05 ("111", "Ahmad", true, 33);
        Dosen05 d2 = new Dosen05 ("222", "Budi", true, 40);
        Dosen05 d3 = new Dosen05 ("333", "Salsa", false, 28);
        Dosen05 d4 = new Dosen05 ("444", "Alwi", true, 35);
        
        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);

        System.out.println("=====================================");
        System.out.println("Data Dosen");
        System.out.println("=====================================");
        list.SortingASC();
        list.tampil();

        System.out.println("Pencarian Data Dosen");
        System.out.println("=====================================");
        System.out.print("Masukkan Nama Dosen: ");
        String nama = sc05.nextLine();
        int pos = list.sequentialSearchNama(nama);
        list.tampilPosisi(nama, pos);
        list.tampilDataSearch(nama, pos);
        list.cekHasilGanda(nama);

        System.out.println("=====================================");
        System.out.println("Masukkan usia dosen yang dicari: ");
        int usia = sc05.nextInt();
        int posUsia = list.binarySearchUsia(usia, 0, list.idx - 1);
        if (posUsia != -1) {
            System.out.println("Dosen dengan usia " + usia + " ditemukan pada index " + posUsia);
            list.tampilDataSearch(list.dataDosen05[posUsia].nama, posUsia);
        } else {
            System.out.println("Data dengan usia " + usia + " tidak ditemukan");
        }
        System.out.println("=====================================");
    }
}