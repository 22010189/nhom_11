package com.mycompany.app;
import com.mycompany.app.Week2Code3.PhuongThuc;
import com.mycompany.app.Week2Code2.Exercise3.debug.Debug;
import com.mycompany.app.Week1Code2.Each_loop;
import com.mycompany.app.Week1Code2.SwitCH;
import com.mycompany.app.Week2Code2.Exercise5.vidu;
public class App {
    public static void main(String[] args) {
        Debug d = new Debug();
        d.debug("xinchao");

        System.out.println("Hello Remote World!");
        
        PhuongThuc a = new PhuongThuc();
        a.helo();
        
        Each_loop b = new Each_loop();
        b.E();

        SwitCH c = new SwitCH();
        c.d();

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

