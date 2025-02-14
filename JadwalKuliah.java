import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        
        int jumlahMataKuliah = 5;
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        int[] sks = new int[jumlahMataKuliah];
        int[] semester = new int[jumlahMataKuliah];
        String[] hariKuliah = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc05.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc05.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc05.nextInt();
            sc05.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc05.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc05.nextInt();
            sc05.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = sc05.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = sc05.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMataKuliah = sc05.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, cariMataKuliah);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc05.close();
    }

    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\n=== Seluruh Jadwal Kuliah ===");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String hariCari) {
        System.out.println("\n=== Jadwal Kuliah pada Hari " + hariCari + " ===");
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(hariCari)) {
                System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
            }
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int semesterCari) {
        System.out.println("\n=== Jadwal Kuliah Semester " + semesterCari + " ===");
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Hari: " + hari[i]);
            }
        }
    }

    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String cari) {
        System.out.println("\n=== Hasil Pencarian Mata Kuliah ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cari)) {
                System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
