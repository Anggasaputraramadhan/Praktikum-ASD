import java.util.Scanner;

public class HitungNilaiAkhir {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc05.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc05.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc05.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc05.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            System.out.println("Nilai akhir: " + nilaiAkhir);

            String hurufMutu;
            String keterangan;

            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                hurufMutu = "A";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 75) {
                hurufMutu = "B+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 65) {
                hurufMutu = "B";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 60) {
                hurufMutu = "C+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 50) {
                hurufMutu = "C";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 40) {
                hurufMutu = "D";
                keterangan = "ANDA TIDAK LULUS";
            } else {
                hurufMutu = "E";
                keterangan = "ANDA TIDAK LULUS";
            }

            System.out.println("Huruf Mutu: " + hurufMutu);
            System.out.println(keterangan);
        }

        sc05.close();
    }
}