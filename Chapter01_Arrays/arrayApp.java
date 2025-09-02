// code ow
class arrayApp {
    public static void main(String[] args) {
        long[] arr; //Khai báo mảng
        arr = new long[100]; //Tạo mảng có kích thước 100
        int nElems = 0; //Số phần tử hiện có trong mảng

        int j; //Chỉ số vòng lặp
        long searchKey; //Giá trị cần tìm

         //Chèn các phần tử vào mảng

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;

        //Hiển thị các phần tử trong mảng
        for(j=0; j<nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");

        //Tìm phần tử trong mảng
        searchKey = 66;
        for(j=0; j<nElems; j++)
            if(arr[j] == searchKey)
                break;
        if(j == nElems)
            System.out.println("Can’t find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        //Xóa phần tử trong mảng
        searchKey = 55;
        for(j=0; j<nElems; j++)
            if(arr[j] == searchKey)
                break;
        for(int k=j; k<nElems-1; k++)
            arr[k] = arr[k+1];
        nElems--;
        for(j=0; j<nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }
}
