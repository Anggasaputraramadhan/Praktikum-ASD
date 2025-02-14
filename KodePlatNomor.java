import java.util.Scanner;

public class KodePlatNomor {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[] kota = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", 
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };
        
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (A-T): ");
        char inputKode = sc05.next().toUpperCase().charAt(0);
        
        boolean ditemukan = false;
        
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Kode plat " + inputKode + " adalah untuk kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat " + inputKode + " tidak ditemukan.");
        }
        
        sc05.close();
    }
}
