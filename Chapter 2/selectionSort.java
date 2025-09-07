public class selectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Duyệt qua từng phần tử
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Đổi chỗ phần tử nhỏ nhất với arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
        System.out.print("Selection Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
