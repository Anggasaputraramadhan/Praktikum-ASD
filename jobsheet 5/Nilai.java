public class Nilai {
    int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    int UTSTertinggi(int arr[], int l, int r) {
        if(l == r) {
            return arr[l];
        } 
        int mid = (l + r) / 2;
        int lmax = UTSTertinggi(arr, l, mid);
        int rmax = UTSTertinggi(arr, mid + 1 , r);
        return (lmax > rmax) ? lmax : rmax;
    }
    int UTSTerendah(int arr[], int l, int r) {
        if(l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lmin = UTSTerendah(arr, l, mid);
        int rmin = UTSTerendah(arr, mid + 1, r);
        return (lmin < rmin) ? lmin : rmin;
    }
    double RataRataUAS(int arr[]) {
        double total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
}