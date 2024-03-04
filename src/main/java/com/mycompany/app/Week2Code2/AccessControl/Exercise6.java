package com.mycompany.app.Week2Code2;

public class Exercise6 {
    public class LopDcBaoVe {
         protected int data;

         public void LopDcBaoVe(int data) {
             this.data = data;
            }
         public int getData(){
            return data;
         }
        }

    public class LopThayDoiLopBaoVe {
            public void LopThayDoiLopBaoVe(LopDcBaoVe a, int value) {
            a.data += value;
            }

        }
}
