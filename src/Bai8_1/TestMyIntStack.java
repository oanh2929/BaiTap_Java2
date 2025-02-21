package Bai8_1;

public class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(3);

        System.out.println("Push 1, 2, 3 vào stack:");
        for (int i = 1; i <= 3; i++) {
            boolean pushed = stack.push(i);
            System.out.println("Push " + i + ": " + (pushed ? "Thành công" : "Thất bại"));
        }

        System.out.println("\nThử push thêm phần tử thứ 4 (stack sẽ mở rộng):");
        stack.push(4); // Stack đầy, sẽ tự mở rộng

        System.out.println("\nPhần tử trên cùng (peek): " + stack.peek());

        System.out.println("\nPop tất cả phần tử:");
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("\nKiểm tra stack có rỗng không: " + stack.isEmpty());
    }
}
