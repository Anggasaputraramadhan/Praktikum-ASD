import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner Sc05 = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = Sc05.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));

        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

        Sc05.close();
    }
}
