package com.mycompany.app.Week2Code2;

public class Exercise6 {
    class LopDcBaoVe {
         protected int data;

         public LopDcBaoVe(int data) {
             this.data = data;
            }
        }

    class LopThayDoiLopBaoVe {
            public void LopThayDoiLopBaoVe(LopDcBaoVe a, int value) {
            a.data += value;
            }

        }
}
