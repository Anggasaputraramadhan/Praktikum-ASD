public class RoyalGarden {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        tampilkanPendapatan(stock, harga);

        hitungTotalStock(stock);

        int[] penguranganStock = {-1, -2, 0, -5};
        kurangiStock(stock, penguranganStock);
    }

    public static void tampilkanPendapatan(int[][] stock, int[] harga) {
        System.out.println("Pendapatan jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }

    public static void hitungTotalStock(int[][] stock) {
        System.out.println("Total stock setiap jenis bunga:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int j = 0; j < stock[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStock += stock[i][j];
            }
            System.out.println(jenisBunga[j] + ": " + totalStock);
        }
        System.out.println();
    }

    public static void kurangiStock(int[][] stock, int[] penguranganStock) {
        System.out.println("Stock setelah pengurangan karena bunga mati:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stock.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] += penguranganStock[j];
                System.out.print(jenisBunga[j] + "=" + stock[i][j] + " ");
            }
            System.out.println();
        }
    }
}
