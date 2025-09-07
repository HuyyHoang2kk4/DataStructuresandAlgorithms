package Chapter3;


public class myQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    // Khởi tạo Queue
    public myQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Thêm phần tử vào Queue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue đầy!");
            return;
        }
        rear = (rear + 1) % capacity; // vòng tròn
        arr[rear] = x;
        size++;
    }

    // Lấy phần tử khỏi Queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue rỗng!");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity; // di chuyển front
        size--;
        return item;
    }

    // Xem phần tử đầu
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue rỗng!");
            return -1;
        }
        return arr[front];
    }

    // Xem phần tử cuối
    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue rỗng!");
            return -1;
        }
        return arr[rear];
    }

    // Kiểm tra rỗng
    public boolean isEmpty() {
        return size == 0;
    }

    // Kiểm tra đầy
    public boolean isFull() {
        return size == capacity;
    }

    // In Queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue rỗng!");
            return;
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    // Hàm main để test Queue
    public static void main(String[] args) {
        myQueue queue = new myQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Queue hiện tại: ");
        queue.printQueue(); // 10 20 30

        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.front());     // 20
        System.out.println("Rear: " + queue.rear());       // 30

        System.out.print("Queue sau khi Dequeue: ");
        queue.printQueue(); // 20 30
    }
}
