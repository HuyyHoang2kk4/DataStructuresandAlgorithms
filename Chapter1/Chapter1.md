# 1.what is Data Structure 
- Đ/nghia : CTDL là cách tổ chức, lưu trữ và quản lý dữ liệu trong bộ nhớ của máy tính để có thể sử dụng hiệu quả
- Mục đích : giúp truy cập , xử lý và thao tác dữ liệu nhanh và tối ưu hơn
- Vd : Mảng , LinkedList , Stack ,..
-> Cấu trúc dữ liệu = cách sắp xếp dữ liệu trong máy tính để xử lý nhanh chóng và hiệu quả.
# 2.what is Algorith ( thuật toán)
- Định nghĩa : là các bước hay quy trình được thiết kế để giải 1 bài toán hoặc thực hiện một thao tác
- Mục đích : đưa ra logic để xử lý dữ liệu
- VD : BubBLE Sort , Merge Sort ,..
->  Thuật toán = cách thức để xử lý dữ liệu

Ý hiểu : CTDL là một nơi để mà lưu trữ dữ liệu để tổ chức và sắp xếp dữ liệu trong bộ nhớ của máy tính 
còn Thuật toán là cách mà xử lý dữ liệu đó ở bên trong ( tức là từng bước giải quyết bài toán)

# Array Data Structure 
- Đ/n : Mảng là một tập hợp các phần tử có cùng kiểu dữ liệu được lưu trữ liên tiếp trong bộ nhớ và mỗi phần tử của mảng có thể truy cập được dựa vào chỉ số index ( từ 0 cho đến n-1) 
- Read Operation ( thao tác đọc)
 - Mục đích : truy xuất giá trị tại một vị trí (index) nhất định
 - Vì có thể đọc mảng trực tiếp bằng chỉ số  -> Độ phức tạp O(1)
 - Nếu đọc ngoài phạm vi indexx -> báo lỗi IndexOutOfBounds.

- Search Operation ( thao tác tìm kiếm)
 -  Mục đích : Tìm kiếm vị trí của một phần tử ở trong mảng
 - Nếu mảng chưa sắp xếp -> phải duyệt qua từng phần tử trong mảng ( dùng Linear Search <tìm kiếm tuần tự>) -> độ phức tạp : O(n)
 - Nếu mảng đã sắp xếp -> tìm ở giữa mảng , sau đó đối chiếu xem số cần tìm lớn hơn hay bé hơn -> tìm được thuộc về bên nào thì vẫn cứ chia đôi mảng đó ra để tìm ( nếu tìm được thì dừng lại) ( dùng Binary Search ( tìm kiếm nhị phân) ) 
 -> độ phức tạp :O(log(n)) < cái này giải thích sau ạ>

 - Trong trường hợp không tìm thấy sẽ trả về -1 hoặc null

- Insert Operation (Thao tác chèn)
 - Mục đích : Thêm phần tử mới vào trong mảng
 - Chèn vào cuối hàng -> thêm phần tử đó vào cuối mảng -> độ phức tạp : 0(1)
 - Chèn vào đầu hàng -> Tất cả các phần tử phải dịch sang bên phải -> độ phức tạp : O(n)

- Delete Operation ( Thao tác xoá)
 - Mục đích : Xoá phần tử ra khỏi mảng
 - Xoá ở cuối mảng -> giảm độ dài -> Độ phức tạp : O(1)
 - Xoá ở đầu mảng -> các phần tử còn lại phải dịch sang trái -> độ phức tạp : o(n)  
 - Xoá ở giữa mảng -> Các phần tử ở phía sau phải dịch sang trái -> độ phức tạp : o(n)
 - TH phần tử ko tồn tại -> thì sẽ k báo lỗi
# Big-O Notation (Ký hiệu độ phức tạp)
-  Đ/n: Big-O Notation là cách mô tả độ phức tạp của thuật toán, tức là mức độ tăng trưởng của thời gian chạy hoặc bộ nhớ khi kích thước đầu vào tăng lên.

- Mục đích: Giúp đánh giá và so sánh hiệu suất của các thuật toán mà không phụ thuộc vào phần cứng hay ngôn ngữ lập trình.

- Các loại độ phức tạp thường gặp
 - O(1) - Constant Time ( thời gian hằng số) -> Thời gian không phụ thuộc vào kích thước dữ liệu
 - O(log(n)) - Logarithmci Time (Thơi gian logarit) -> mỗi bước thì sẽ chia nhỏ dữ liệu ra

 - O(n) -> liner time (thời gian tuyến tính ) -> Thời gian tăng với tỷ lệ thuận với số phần tử

- O(n log n) – Linearithmic Time -> 

- O(n²) – Quadratic Time (thời gian bậc hai) -> thời gian tăng bình phương khi số phần tử tăng

 - O(2^n) – Exponential Time (thời gian lũy thừa) -> tang nhanh khi dữ liệu lớn- > rất chậm
 