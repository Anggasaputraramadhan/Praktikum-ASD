import java.util.Scanner;

public class MenghitungIPSemester {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("============================");

        double totalNilai = 0;
        int totalSKS = 0;

        String[] namaMatkul = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 3, 2, 3, 2, 3, 2, 2};
        double[] nilaiSetara = new double[namaMatkul.length];
        int[] nilaiAngka = new int[namaMatkul.length];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMatkul[i] + ": ");
            nilaiAngka[i] = sc05.nextInt();

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] >= 73) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] >= 60) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] >= 40) {
                nilaiSetara[i] = 1;
            } else {
                nilaiSetara[i] = 0;
            }

            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalNilai / totalSKS;

        System.out.println("\n====================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================================");
        System.out.println("MK\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < namaMatkul.length; i++) {
            String nilaiHuruf = getNilaiHuruf(nilaiSetara[i]);
            System.out.printf("%-30s\t%.2f\t\t%s\t\t%.1f%n", namaMatkul[i], (double) nilaiAngka[i], nilaiHuruf, nilaiSetara[i]);
        }
        System.out.println("====================================");
        System.out.printf("IP : %.2f%n", ipSemester);

        sc05.close();
    }

    public static String getNilaiHuruf(double nilaiSetara) {
        switch ((int) (nilaiSetara * 10)) {
            case 40: return "A";
            case 35: return "B+";
            case 30: return "B";
            case 25: return "C+";
            case 20: return "C";
            case 10: return "D";
            default: return "E";
        }
    }
}
