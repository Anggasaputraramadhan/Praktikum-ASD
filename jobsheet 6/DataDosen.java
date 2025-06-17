public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen d) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = d;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}
