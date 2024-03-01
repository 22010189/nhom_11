public class SecondClass {
    private FirstClass firstObj;

    SecondClass() {
        System.out.println("SecondClass object initialized");
    }

    void lazyInitialization() {
        if (firstObj == null) {
            firstObj = new FirstClass();
        }
    }

    void secondMethod() {
        System.out.println("SecondClass method called");
        if (firstObj != null) {
            firstObj.firstMethod();
        } else {
            System.out.println("FirstClass object not yet initialized");
        }
    }
}
