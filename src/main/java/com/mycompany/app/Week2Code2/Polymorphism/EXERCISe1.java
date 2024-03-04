package com.mycompany.app.Week2Code2.Polymorphism;
class Cycle {
   
    public void ride() {
        
        System.out.println("Riding a cycle");
    }
}


class Unicycle extends Cycle {
    
    @Override
    public void ride() {
      
        System.out.println("Riding a unicycle");
    }
}


class Bicycle extends Cycle {
   
    @Override
    public void ride() {
      
        System.out.println("Riding a bicycle");
    }
}


class Tricycle extends Cycle {
   
    @Override
    public void ride() {
        
        System.out.println("Riding a tricycle");
    }
}

/*
public class Test {
    public static void main(String[] args) {
        // Tạo một mảng của Cycle chứa các đối tượng của các lớp con
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle(); // Upcast từ Unicycle sang Cycle
        cycles[1] = new Bicycle(); // Upcast từ Bicycle sang Cycle
        cycles[2] = new Tricycle(); // Upcast từ Tricycle sang Cycle

        // Duyệt qua mảng và gọi phương thức ride của mỗi đối tượng
        for (Cycle c : cycles) {
            c.ride();
        }
    }
}
*/

