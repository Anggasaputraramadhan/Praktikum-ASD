public class MahasiswaDemo05 {
    public static void main(String[] args) {
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05();

        Mahasiswa05 m1 = new Mahasiswa05("111", "Ayu", "2c", 3.7);
        Mahasiswa05 m2 = new Mahasiswa05("222", "dika", "2c", 3.0);
        Mahasiswa05 m3 = new Mahasiswa05("333", "ila", "2c", 3.8);
        Mahasiswa05 m4 = new Mahasiswa05("444", "susi", "2c", 3.1);
        Mahasiswa05 m5 = new Mahasiswa05("555", "yayuk", "2c", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah diurutkan dengan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();


    }
}
