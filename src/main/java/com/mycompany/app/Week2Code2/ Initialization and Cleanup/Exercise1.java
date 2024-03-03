public class UninitializedStringReference {
    private String str;

    public void printString() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        UninitializedStringReference instance = new UninitializedStringReference();
        instance.printString();
    }
}
