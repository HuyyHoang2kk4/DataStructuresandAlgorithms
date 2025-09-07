public class insertSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // phần tử cần chèn
            int j = i - 1;

            // Dịch chuyển các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Chèn key vào đúng vị trí
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);
        System.out.print("Insertion Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
