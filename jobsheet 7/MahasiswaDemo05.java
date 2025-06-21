
import java.util.Scanner;
public class MahasiswaDemo05 {   
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc05.nextInt();
        sc05.nextLine();

        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumlahMhs);
        for(int i = 0; i < jumlahMhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-"+ (i+1));
            System.out.print("NIM : ");
            String nim = sc05.nextLine();
  
            System.out.print("Nama : ");
            String nama = sc05.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc05.nextLine();

            System.out.print("IPK : ");
            double ipk = sc05.nextDouble();
            sc05.nextLine();
            
            list.tambah(new Mahasiswa05(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        double cari = sc05.nextDouble();

        System.out.println("Menggunakan sequential searching ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        cari = sc05.nextDouble();
        System.out.println("menggunakan Binary Search ");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        }
    }
