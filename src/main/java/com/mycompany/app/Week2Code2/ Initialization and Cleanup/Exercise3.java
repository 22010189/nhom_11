public class Exercise3 {
    
    public MessagePrinter() {
        System.out.println("Default message");
    }

    public MessagePrinter(String message) {
        System.out.println("Custom message: " + message);
    }

    public static void main(String[] args) {
        MessagePrinter printer1 = new MessagePrinter();

        MessagePrinter printer2 = new MessagePrinter("Hello there!");
    }
}
