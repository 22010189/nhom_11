public class Dog {
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Wuff!");
        }
    }

    public void bark(double pitch) {
        if (pitch < 0.5) {
            System.out.println("Huuuu!");
        } else {
            System.out.println("Gau!");
        }
    }

    public void bark(boolean aggressive) {
        if (aggressive) {
            System.out.println("Gur!");
        } else {
            System.out.println("Wuff!");
        }
    }

    public void bark(int times, double pitch) {
        for (int i = 0; i < times; i++) {
            if (pitch < 0.5) {
                System.out.println("Huuu!");
            } else {
                System.out.println("Guac!");
            }
        }
    }

    public void bark(double pitch, int times) {
        for (int i = 0; i < times; i++) {
            if (pitch < 0.5) {
                System.out.println("Huuu!");
            } else {
                System.out.println("Gauu!");
            }
        }
    }

    // Overloaded bark method for String type
    public void bark(String message) {
        System.out.println("Dog says: " + message);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark(3); 
        dog.bark(0.5); 
        dog.bark(0.7); 
        dog.bark(true); 
        dog.bark(false); 
        dog.bark("Hello!"); 
        dog.bark(2, 0.3); 
        dog.bark(0.3, 2); 
    }
}
