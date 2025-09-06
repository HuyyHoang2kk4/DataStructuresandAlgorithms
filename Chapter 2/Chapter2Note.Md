# Chương 2 : Các thuật toán sắp xếp

## 1.Bubble Sort ( Sắp xếp nổi bọt)
 - ý tưởng : so sánh phần tử liền kề -> nếu phần tử lớn hơn phần tử sau -> hoán đổi -> sau mỗi vòng lặp thì phần tử lớn nhất sẽ ở cuối mảng

 - Quy trình : duyệt từ đầu mảng đến cuối
              -> so sánh arr[i] và arr[i+1]
              -> nếu arr[i] > arri[i+1] thì đổi chỗ 
              -> lặp lại cho đến khi mảng đượ sắp xếp

 - Độ phức tạp : Best Case : O(n) nếu mảng đước sắp xếp
                 Average Case : O(n^2)

  - Bộ nhớ : O(1) vì không cần mảng phụ

  - Ưu điểm : dễ hiểu , dễ cài đặt
  - Nhược điểm : rất chậm với dữ liệu lớn

## Selection Sort ( SẮP xếp chọn)

 - Ý tưởng : tìm phần tử nhỏ nhất và đặt nó vào đầu mảng -> sau đó tiếp tục với các phần tử còn lại

 - Quy trình :  Giả sử vị trí đầu tiên nhỏ nhất là (minIndex = 1) 
             -> Duyệt các phần tử còn lại để tìm phần tử nhỏ hơn
             _> nếu tìm thấy -> cập nhật minIndex 
             -> sau khi duyệt xong -> hoán đổi arr[i] với arr[minIndex]
             -> Lặp lại cho đến khi hết mảng

 - Độ phức tạp : O(n^2) 
 - Số lần so sánh : n(n-1)/2
 - Ưu điểm : ít số lần hoá đổi hơn Bubble Sort
 - Nhược điểm : vẫn chậm khi mảng lớn


## Insert Sort
- Ý tưởng : Lấy từng phần tử và chèn vào vị trí trong dãy đã được sắp xếp . Gống như xếp bài ở trên lá tay ; rút 1 lá tìm chỗ đúng và chèn vào (cái này cháu nói hơi khó hiểu ạ) 

- Cách hoạt động : Giả sử phần tử đầu tiên đã sắp -> lấy phần tử tiếp (key)  -> So sánh key với phần tử bên trái -> nếu lớn hơn key thì di chuyển sang phải -> lặp lại cho đến khi tìm đúng vị trí để chèn key

- Độ phức tạp : O(n^2)
- Ưu điểm : hiệu quả với mảng nhỏ  hoặc gần sắp xếp
- Nhược điểm : chậm khi mảng lớn
