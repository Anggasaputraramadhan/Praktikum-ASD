public class MahasiswaBerprestasi05 {
    Mahasiswa05[] listMhs = new Mahasiswa05[5];
    int idx;

    void tambah(Mahasiswa05 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa05 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk < listMhs[j - 1].ipk) {
                    Mahasiswa05 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa05 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
    for (int i = 1; i < listMhs.length; i++) {
        Mahasiswa05 key = listMhs[i];
        int j = i - 1;

        while (j >= 0 && listMhs[j].ipk > key.ipk) {
            listMhs[j + 1] = listMhs[j];
            j = j - 1;
        }
        listMhs[j + 1] = key;
    }
}

}