package com.mycompany.app.Week2Code1;

public class Recursion {
    
    public static int Recursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Recursion(n - 1);
        }
    }
}
    
