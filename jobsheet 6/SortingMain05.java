import java.util.Scanner;

public class SortingMain05 {
    public static void main(String[] args) {
        int c[] = {40, 10, 4, 9, 3};

        Sorting05 dataurut3 = new Sorting05(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil05();
        dataurut3.insertionSort05();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil05();
    }
}