public class Exercise2 {
    private String str1 = "Được khởi tạo tại điểm định nghĩa";
    private String str2;

    public void StringInitializationExample(String initialValue) {
        this.str2 = initialValue;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public static void main(String[] args) {
        Exercise2 example1 = new Exercise2();
        example1.StringInitializationExample("Được khởi tạo thông qua constructor");

        System.out.println("str1: " + example1.getStr1());
        System.out.println("str2: " + example1.getStr2());
    }
}
