public class QueueMahasiswaTugas05 {
    NodeTugas05 front, rear;
    int size, maxSize;

    public QueueMahasiswaTugas05(int maxSize) {
        this.front = this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void enqueue(MahasiswaTugas05 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeTugas05 baru = new NodeTugas05(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(">> " + mhs.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.print(">> Memanggil: ");
        front.data.tampil();
        front = front.next;
        if (front == null) rear = null;
        size--;
    }

    public void peekFront() {
        if (front != null) {
            System.out.print("Terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (rear != null) {
            System.out.print("Paling Akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Isi Antrian:");
        NodeTugas05 tmp = front;
        while (tmp != null) {
            tmp.data.tampil();
            tmp = tmp.next;
        }
    }
}
