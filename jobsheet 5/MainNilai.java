public class MainNilai {
    public static void main(String[] args) {

        Nilai nilai = new Nilai();

        int UTSTertinggi = nilai.UTSTertinggi(nilai.nilaiUTS, 0, nilai.nilaiUTS.length - 1);
        int UTSTerendah = nilai.UTSTerendah(nilai.nilaiUTS, 0, nilai.nilaiUTS.length - 1);
        double RataRataUAS = nilai.RataRataUAS(nilai.nilaiUAS);

        System.out.println("==========================================");
        System.out.println("Nilai UTS Tertinggi   : " + UTSTertinggi);
        System.out.println("Nilai UTS Terendah    : " + UTSTerendah);
        System.out.println("Rata-rata nilai UAS   : " + RataRataUAS);
        System.out.println("==========================================");
    }
}