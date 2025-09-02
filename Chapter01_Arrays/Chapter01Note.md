# Chương 1 : Array
Mảng là một CTDL cơ bản và phổ biến ở trong lập trình
Ở trong chương này :
- giới thiệu mảng trong Java và cách tự xây dựng một lớp mảng.
- mảng có thứ tự (ordered array), trong đó dữ liệu sắp xếp tăng dần/giảm dần → giúp tìm kiếm nhị phân (binary search) nhanh hơn.
- giới thiệu về ký hiệu Big O, để đo lường hiệu suất thuật toán.


<!-- ## 1.Ví dụ minh hoạ 
Bài toán yêu cầu quản lý cầu thủ nên cần 1 chương trình để điểm danh
- Thêm ( insert) khi một cầu thủ đến sân
- Tìm ( search) xem cầu thủ đó có mặt không
- Xoá ( delete) khi cầu thủ đó đi về

Về chương trình có các button
- Ins để chèn dữ liệu
- Find để tìm kiếm dữ liệu
- Del để xoá
- New để tạo 1 mảng mới với kích thước tuỳ chọn
- Fill để điền dữ liệu ngẫu nhiên từ 0-999

Insertion
- Mảng có 20 ô và 10 phần tử , ở chế độ No Dups ( k lặp lại) 
- Nhấn nút Ins để chèn dữ liệu  -> nhập số áo  -> xác nhận -> phần từ ( số + màu ngãu nhiêu)
- Chèn sẽ được thêm vào ô kế tiếp
- Nếu lặp trùng số thì sẽ thông báo lỗi

Searching
- Nhập Find -> nhập số áo cần tìm -> thuật toán duyệt từ index =0 -> mỗi lần ấn index sẽ tăng dần và kiểm tra index tương ứng
- Nếu tìm thấy -> Thông báo và dừng lại (trong bài này ở chế đọ No dups) 
- Nếu không tìm thấy -> duyệt hết dữ liệu và thông báo
=> Trung bình cần N/2 bước để tìm thấy và xấu nhất là N bước
Tìm kiếm(N buoc)sẽ chậm hơn nhiều so với insert ( N bước )
 -->
## 1. Giới thiệu về mảng trong Java
Mảng (Array) là cấu trúc dữ liệu dùng để lưu nhiều giá trị cùng kiểu trong một biến duy nhất
Đặc điểm:
- Truy cập nhanh theo chỉ số (index) từ 0 đến n-1
- Kích thước cố định khi khởi tạo
- Dữ liệu được lưu liền nhau trong bộ nhớ

int[] numbers = new int[5]; // tạo mảng 5 phần tử, mặc định là 0
numbers[0] = 10;            // gán giá trị cho phần tử đầu
numbers[1] = 20;            // gán giá trị cho phần tử thứ hai

- Truy cập và thay đổi phần tử:

int x = numbers[2];   // lấy phần tử thứ 3 (index 2)
numbers[3] = 100;     // gán giá trị 100 cho phần tử thứ 4

chỉ số bắt đầu từ 0 -> n-1

- Tạo mảng nhiều kiểu dữ liệu
double[] temps = {36.5, 37.0, 38.2};  // mảng số thực
String[] names = {"Alice", "Bob"};    // mảng chuỗi


    
## 2.Mảng có thứ tự ( Ordered Array)
là mảng được sắp xếp theo thứ tự tăng hoặc giảm dần -> Dữ liệu luôn duy trì thứ tự → khi thêm mới, phải chèn vào đúng vị trí để giữ mảng có thứ tự
Việc thêm và xóa có thể chậm hơn (cần dịch các phần tử), nhưng đổi lại tìm kiếm sẽ nhanh hơn

Thêm phần tử (Insert) 
Tìm vị trí thích hợp để chèn phần tử mới sao cho mảng vẫn giữ thứ tự (tăng dần hoặc giảm dần) -> dịch các phần tử sang bên phải -> Gán giá trị mới vào giá trị vừa tìm được
Độ phức tạp :O(n)

Xoá phần tử ( Delete)
tìm vị trí phần tử cần xoá -> Dịch tất cả các phần tử bên phải sang trái để lấp khoảng trống -> giảm số lượng phần tử
Độ phức tạp : o(n)

Tìm kiếm phần tử ( Search ) ( Binary search)
Vì mảng có thứ tự, ta áp dụng binary search:
So sánh giá trị cần tìm với phần tử giữa
Nếu bằng → tìm thấy
Nếu nhỏ hơn → chỉ tìm trong nửa trái
Nếu lớn hơn → chỉ tìm trong nửa phải
Độ phức tạp: O(log n)

## 3.Big0
BogO là để đo lường hiệu suất của thuật toán như thời gian chạy -> thuật toán chạy nhanh hay chậm khi dữ liệu  tăng , bộ nhớ sử dụng -> cần sử dụng bao nhiêu khi bộ nhớ tăng

- Ý nghĩa : cho biết độ lớn của công việc mà thuật toan phải làm khi tăng dữ liệu lên nhiều lần và giúp ta biết lên sử dụng thuật toán nào

- O(1)->Hằng số (Constant time)->Nhanh nhất, không phụ thuộc vào số lượng dữ liệu
- O(log n)->Logarithmic time->Rất nhanh, thường gặp trong binary search
- O(n)->Tuyến tính (Linear time)-?Tốc độ tăng tỷ lệ thuận với số phần tử
- O(n log n)->Nhanh hơn O(n²)->Thường gặp trong các thuật toán sắp xếp hiệu quả (QuickSort, MergeSort)
 - O(n²)->Bình phương (Quadratic)->Chậm khi dữ liệu lớn, ví dụ Bubble Sort, Selection Sort
 - O(2ⁿ)->Hàm mũ (Exponential)->Rất chậm

O(1) > O(log n) > O(n) > O(n log n) > O(n²) >  O(2ⁿ)

