
abstract class Test {
    private int value;

    public Test(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

/*
public class Main {
    public static void main(String[] args) {
        // Cố gắng tạo một thể hiện của lớp Test
        Test t = new Test(10); // Lỗi biên dịch: Test là abstract; không thể khởi tạo
    }
}
*/
