public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 data = new SingleLinkedList05();

        Mahasiswa05 m1 = new Mahasiswa05("21212203", "Dirga", "4D", 3.6);
        Mahasiswa05 m2 = new Mahasiswa05("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa05 m3 = new Mahasiswa05("22212202", "Cintia", "3C", 3.5);
        Mahasiswa05 m4 = new Mahasiswa05("23212201", "Bimon", "2B", 3.8);

        data.addFirst(m1);
        data.addLast(m2);
        data.insertAfter("21212203", m3);
        data.insertAt(2, m4);

        System.out.println("Sebelum penghapusan:");
        data.print();
        System.out.println();

        System.out.println(">> Data index 1:");
        data.getData(1);

        System.out.println("\n>> Data mahasiswa an Bimon berada pada index: " + data.indexOf("Bimon"));
        System.out.println();

        data.removeFirst();
        System.out.println("Setelah removeFirst():");
        data.print();

        data.removeLast();
        System.out.println("Setelah removeLast():");
        data.print();

        data.removeAt(0);
        System.out.println("Setelah removeAt(0):");
        data.print();
    }
}
