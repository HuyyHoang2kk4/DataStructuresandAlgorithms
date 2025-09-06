import java.util.Scanner;

public class baiTapMang {
    // Hàm in mảng
    public static void inMang(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 1. Thêm phần tử vào mảng
    public static int[] themPhanTu(int[] arr, int value, int pos) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // 2. Xóa phần tử tại vị trí pos
    public static int[] xoaPhanTu(int[] arr, int pos) {
        int n = arr.length;
        if (pos < 0 || pos >= n) {
            System.out.println("Vị trí không hợp lệ!");
            return arr;
        }
        int[] newArr = new int[n - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos + 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    // 3. Đảo ngược mảng
    public static void daoNguoc(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 4. Ghép 2 mảng
    public static int[] ghepMang(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] newArr = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            newArr[n1 + i] = arr2[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm phần tử");
            System.out.println("2. Xóa phần tử");
            System.out.println("3. Đảo ngược mảng");
            System.out.println("4. Ghép 2 mảng");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị cần thêm: ");
                    int value = sc.nextInt();
                    System.out.print("Nhập vị trí cần thêm (0 - " + arr.length + "): ");
                    int posAdd = sc.nextInt();
                    arr = themPhanTu(arr, value, posAdd);
                    System.out.print("Mảng sau khi thêm: ");
                    inMang(arr);
                    break;

                case 2:
                    System.out.print("Nhập vị trí cần xóa (0 - " + (arr.length - 1) + "): ");
                    int posDel = sc.nextInt();
                    arr = xoaPhanTu(arr, posDel);
                    System.out.print("Mảng sau khi xóa: ");
                    inMang(arr);
                    break;

                case 3:
                    daoNguoc(arr);
                    System.out.print("Mảng sau khi đảo ngược: ");
                    inMang(arr);
                    break;

                case 4:
                    int[] arr2 = {9, 8, 7};
                    int[] arrGhep = ghepMang(arr, arr2);
                    System.out.print("Mảng sau khi ghép: ");
                    inMang(arrGhep);
                    break;

                case 5:
                    System.out.println("Thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
