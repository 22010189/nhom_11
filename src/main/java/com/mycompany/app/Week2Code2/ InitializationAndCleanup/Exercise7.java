public class Tank {
    private boolean isEmpty;

    public Tank() {
        isEmpty = true; 
    }

    public void fillTank() {
        isEmpty = false;
        System.out.println("Tank filled.");
    }

    public void emptyTank() {
        isEmpty = true;
        System.out.println("Tank emptied.");
    }

    public void finalize() {
        if (!isEmpty) {
            System.out.println("Tank not empty");
        } else {
            System.out.println("Tank is empty ");
        }
    }

    public static void main(String[] args) {
        Tank tank1 = new Tank(); 

        tank1.fillTank();
        tank1.emptyTank();

        Tank tank2 = new Tank();
        tank2.fillTank();

        Tank tank3 = new Tank();

        tank1 = null;
        tank2 = null;
        tank3 = null;
        System.gc(); 
    }
}
