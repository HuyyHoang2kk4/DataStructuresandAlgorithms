public class bubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Lặp qua tất cả các phần tử
        for (int i = 0; i < n - 1; i++) {
            // Vòng lặp so sánh từng cặp phần tử
            for (int j = 0; j < n - i - 1; j++) {
                // Nếu phần tử đứng trước lớn hơn phần tử đứng sau thì đổi chỗ
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
