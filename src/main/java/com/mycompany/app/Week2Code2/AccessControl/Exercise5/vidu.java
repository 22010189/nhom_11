package com.mycompany.app.Week2Code2.Exercise5;
public class vidu {
    public int a = 10; // Trường public
    private int b = 20; // Trường private
    protected int c = 30; // Trường protected
    int d = 40; // Trường package-access (mặc định)
    public void m1() { // Phương thức public
        System.out.println("xinchao");
    }

    private void m2() { // Phương thức private
        System.out.println("nihao");
    }

    protected void m3() { // Phương thức protected
        System.out.println("konnichiwa");
    }

    void m4() { // Phương thức package-access (mặc định)
        System.out.println("heloo");
    }
}

/*
 
class Test {
    public static void main(String[] args) {
        vidu t = new vidu();

        System.out.println(t.a); // Có thể truy cập được vì là public
   //   System.out.println(t.b); // Không thể truy cập được vì là private
   //   System.out.println(t.c); // Không thể truy cập được vì là protected
   //   System.out.println(t.d); // Không thể truy cập được vì là package-access

        t.m1(); // Có thể truy cập được vì là public
     // t.m2(); // Không thể truy cập được vì là private
     // t.m3(); // Không thể truy cập được vì là protected
     // t.m4(); // Không thể truy cập được vì là package-access
    }
}
 */
    
