public class DataDosen05 {
    public static void dataSemuaDosen(Dosen05[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].cetakInfo(i + 1);
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin()) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        
        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin()) {
                totalPria += dosen.getUsia();
                countPria++;
            } else {
                totalWanita += dosen.getUsia();
                countWanita++;
            }
        }

        double rataPria = (countPria > 0) ? (double) totalPria / countPria : 0;
        double rataWanita = (countWanita > 0) ? (double) totalWanita / countWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen05[] arrayOfDosen) {
        Dosen05 tertua = arrayOfDosen[0];
        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.getUsia() > tertua.getUsia()) {
                tertua = dosen;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo(0);
    }

    public static void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        Dosen05 termuda = arrayOfDosen[0];
        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.getUsia() < termuda.getUsia()) {
                termuda = dosen;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo(0);
    }
}
