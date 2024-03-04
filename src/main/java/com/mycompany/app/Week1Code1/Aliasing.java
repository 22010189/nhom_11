packagge com.package com.mycompany.app.Week1Code1;

/**
 * Aliasing
 */
public class Aliasing {

    
}
public class PassObject {
 static void f(Number m) {
 m.i = 15;
 }
 public static void main(String[] args) {
 Number n = new Number();
 n.i = 14;
 f(n); // what is n.i now?
 }
}
