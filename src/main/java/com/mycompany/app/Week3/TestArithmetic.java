package com.mycompany.app.week3;

public interface TestArith{
    public class Node {
        public Node() {}
        public double eval() {
        System.out.println("Error: eval Node");
        return 0;
        }
       }
       public class Binop extends Node {
        protected Node lChild, rChild;
        public Binop(Node l, Node r) {
        lChild = l;
       rChild = r;
        }
       }
       public class Plus extends Binop {
        public Plus(Node l, Node r) {
        super(l, r);
        public double eval() {
        return lChild.eval() + rChild.eval();
        }
       }
    }
       public class Const extends Node {
        private double value;
        public Const(double d) { value = d; }
        public double eval() { return value; }
       }
}
