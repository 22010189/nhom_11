public class MethodCallingExample {
    public void phuongThuc1() {
        System.out.println("1");
        phuongThuc2();
        this.phuongThuc2();
    }
    public void phuongThuc2() {
        System.out.println("2");
    }
    public static void main(String[] args) {
        MethodCallingExample example = new MethodCallingExample();
        example.phuongThuc1();
    }
}
