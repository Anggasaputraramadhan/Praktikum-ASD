public class MainTugas05 {
    public static void main(String[] args) {
        QueueMahasiswaTugas05 antrian = new QueueMahasiswaTugas05(5);

        antrian.enqueue(new MahasiswaTugas05("22001", "Andi", "Legalisir Ijazah"));
        antrian.enqueue(new MahasiswaTugas05("22002", "Budi", "Pengajuan Beasiswa"));
        antrian.enqueue(new MahasiswaTugas05("22003", "Citra", "Konsultasi Akademik"));

        System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
        System.out.println("Apakah antrian penuh? " + antrian.isFull());

        antrian.dequeue();

        antrian.peekFront();
        antrian.peekRear();

        antrian.jumlahAntrian();
        antrian.printQueue();
    }
}
