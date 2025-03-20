import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {

        Scanner Sc05 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = Sc05.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis element ke-" + (i + 1) + " : ");
            int basis = Sc05.nextInt();
            System.out.print("Masukkan nilai pangkat element ke-" + (i + 1) + " : ");
            int pangkat = Sc05.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BruteForce: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Divide and Conquer: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}