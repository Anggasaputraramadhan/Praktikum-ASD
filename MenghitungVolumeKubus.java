import java.util.Scanner;

public class MenghitungVolumeKubus {

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void tampilkanMenu() {
        System.out.println("=== Program Menghitung Kubus ===");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int pilihan;
        double sisi;

        do {
            tampilkanMenu();
            pilihan = sc05.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    sisi = sc05.nextDouble();
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    sisi = sc05.nextDouble();
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    sisi = sc05.nextDouble();
                    System.out.println("Keliling kubus (total panjang rusuk): " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 4);

        sc05.close();
    }
}
