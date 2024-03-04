package com.mycompany.app.Week2Code2.AccessControl.Exercise4.p2;
public class lop4 extends lop1 {
    public void D() {
        // Tạo một đối tượng của lớp D
        lop4 d = new lop4();
        // Gọi phương thức A của đối tượng d
        d.A(); // Có thể truy cập được vì là lớp con của lớp A
    }
}
