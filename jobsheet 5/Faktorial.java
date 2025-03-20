public class Faktorial {

    public class Pangkat {
        int angka;
        int pangkat;
    
        public Pangkat(int angka, int pangkat) {
            this.angka = angka;
            this.pangkat = pangkat;
        }
    }
    
    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto *= i;
            i++;
        } while (i <= n);
        return fakto;
    }
    

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}
