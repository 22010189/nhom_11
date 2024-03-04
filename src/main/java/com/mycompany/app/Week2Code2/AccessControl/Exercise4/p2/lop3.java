package com.mycompany.app.Week2Code2.AccessControl.Exercise4.p2;
public class lop3 {
    public void C (){
        lop1 a = new lop1();
        // Gọi phương thức A của đối tượng a
        a.A(); // Không thể truy cập được vì khác gói package
    }
}
