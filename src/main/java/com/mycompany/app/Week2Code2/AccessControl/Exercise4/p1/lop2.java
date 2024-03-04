package com.mycompany.app.Week2Code2.AccessControl.Exercise4.p1;
public class lop2 {
    public void B() {
        lop1 a = new lop1();
        // Gọi phương thức A của đối tượng a
        a.A(); // Có thể truy cập được vì cùng gói package
    }
}
