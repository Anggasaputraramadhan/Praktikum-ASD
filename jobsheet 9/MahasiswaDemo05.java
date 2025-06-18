import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);
        Scanner sc05 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc05.nextInt();
            sc05.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc05.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc05.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc05.nextLine();
                    Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas);
                    stack.push(mhs);
                    break;
                case 2:
                    Mahasiswa05 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai Tugas Dari " + dinilai.nama);
                        System.out.println("Mengubah nilai (0-100): ");
                        int nilai = sc05.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);

                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);

                    }
                    break;
                case 3:
                    Mahasiswa05 atas = stack.peek();
                    if (atas != null) {
                        System.out.println("Tugas teratas: " + atas.nama + ", NIM: " + atas.nim);
                    }
                    break;
                case 4:
                    stack.print();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}
