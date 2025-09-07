package Chapter3;

public class myStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Khởi tạo Stack
    public myStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // ban đầu rỗng
    }

    // Thêm phần tử vào stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack đầy!");
            return;
        }
        arr[++top] = x;
    }

    // Lấy phần tử ở đỉnh stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack rỗng!");
            return -1;
        }
        return arr[top--];
    }

    // Xem phần tử trên cùng
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack rỗng!");
            return -1;
        }
        return arr[top];
    }

    // Kiểm tra stack rỗng
    public boolean isEmpty() {
        return top == -1;
    }

    // Kiểm tra stack đầy
    public boolean isFull() {
        return top == capacity - 1;
    }

    // In stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Hàm main để test stack
    public static void main(String[] args) {
        myStack stack = new myStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.print("Stack hiện tại: ");
        stack.printStack(); // 10 20 30

        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Peek: " + stack.peek()); // 20

        System.out.print("Stack sau khi Pop: ");
        stack.printStack(); // 10 20
    }
}
