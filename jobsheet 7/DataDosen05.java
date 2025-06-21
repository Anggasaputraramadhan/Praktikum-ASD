
public class DataDosen05 {
    Dosen05 [] dataDosen05 = new Dosen05[4];
    int idx;

    void DataDosen05(int jmlDosen) {
        dataDosen05 = new Dosen05[jmlDosen];
    }

    void tambah(Dosen05 d) {
        if (idx < dataDosen05.length) {
            dataDosen05[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen05 d : dataDosen05) {
            d.tampilInfo();
        }
    }

    int sequentialSearchNama(String cari) {
        for (int i = 0; i < idx; i++) {
            if (dataDosen05[i].nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearchUsia(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (dataDosen05[mid].usia == cari) {
                return mid;
            } else if (dataDosen05[mid].usia > cari) {
                return binarySearchUsia(cari, left, mid - 1);
            } else {
                return binarySearchUsia(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama '" + x + "' ditemukan pada index " + pos);
        } else {
            System.out.println("Data '" + x + "' tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + dataDosen05[pos].kode);
            System.out.println("Nama\t\t : " + dataDosen05[pos].nama);
            System.out.println("Jenis Kelamin\t : " + (dataDosen05[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia\t\t : " + dataDosen05[pos].usia);
        } else {
            System.out.println("Data Dosen dengan nama '" + x + "' tidak ditemukan");
        }
    }

    void cekHasilGanda(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen05[i].nama.equalsIgnoreCase(nama)) {
                count++;
                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari 1 dosen dengan nama '" + nama + "'!");
                    break;
                }
            }
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen05.length-1; i++) {
            for (int j = 1; j < dataDosen05.length-i; j++) {
                if (dataDosen05[j].usia<dataDosen05[j-1].usia) {
                    Dosen05 temp = dataDosen05[j];
                    dataDosen05[j]=dataDosen05[j-1];
                    dataDosen05[j-1]=temp;
                }
            }
        }
    }

    void tambah05(Dosen05 d) {
        if (idx < dataDosen05.length) {
            dataDosen05[idx] = d;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }
}


