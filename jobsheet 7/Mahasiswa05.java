import java.util.Scanner;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa05(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;        
    }

    void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    void inputDataDariUser() {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc05.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[jml];

    for (int i = 0; i < jml; i++) {
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.print("Nama: ");
        String nama = sc05.next();
        System.out.print("IPK: ");
        double ipk = sc05.nextDouble();

        mhs[i] = new Mahasiswa(nama, ipk);
        }

        this.dataMahasiswa = mhs;
    }

}