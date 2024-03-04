package com.mycompany.app.Week1Code1;
public class Part1{
public class Number {
 public int i;
}
public class Assignment1 {
 
 Number n1 = new Number();
 Number n2 = new Number();
 n1.i = 2;
 n2.i = 5;
 n1.i = n2.i;
 n2.i = 10;// what is n1.i?   n1.i=5
 }
}
