# Chương 3 : Stack và queue

## Stack
- Định nghĩa : Stack là 1 CTDL , đặc trưng bởi nguyên tắc Last In First Out (LIFO) Phần tử nào được đưa vào cuối cùng thì sẽ ra đầu tiên 
- Cấu trúc :  Một stack gồm có : Top(đỉnh) , con trỏ chỉ vào phần tử được thêm vào sau cùng . Mảng / danh sách lưu trữ là nơi chưuas các phần tử
- Các thao tác cơ bản gồm
+ Push(x) Têm phần tử x vào đỉnh của stack
+ Pop(x) lấy phần tử x ở đầu đầu đỉnh của stack và xoá phần tử đó
+ Peek()/Top() : lấy phần tử ở đỉnh stack và không xoá nó
+ isEmpty() ktra xem stack có rỗng không
+ Size() " Trả về số lượng phần tử có trong stack

- Độ phức tạp        Push = Peek = Pop O(1)
- Ứng dụng của stack : ... 

## Queue
- Địnhk nghĩa ; Queue là 1 CTDL , đặc trưng bởi nguyên tắc First In First Out (FIFO) phần tử được đưa vào đầu tiên thì sẽ lấy ra đầu tiên
- Cấu trúc : 
+ Font() : con trỏ chỉ ở phần tử đầu tiên
+ Rear() : con trỏ chỉ phần tử được thêm vào sau cùng
+ Mảng : nơi chứa các phần tử

- Các thao tác cơ bản
+ Enqueue(x): Thêm phần tử x vào cuối hàng đợi
+ Dequeue(): Lấy phần tử ở đầu hàng đợi ra (và xoá nó)
+ Front(): Xem phần tử ở đầu hàng đợi (không xoá)
+ Rear(): Xem phần tử ở cuối hàng đợi
+ isEmpty(): Kiểm tra hàng đợi rỗng hay không
+ Size(): Trả về số phần tử hiện có

- Độ phức tạp :
Enqueue: O(1)
Dequeue: O(1)
Front/Rear: O(1)