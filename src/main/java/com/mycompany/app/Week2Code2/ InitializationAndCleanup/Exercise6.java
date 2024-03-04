public class FinalizeExample {
    public void finalize() {
        System.out.println("finalize.");
    }
    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null;
        System.gc();
        System.runFinalization();
    }
}
