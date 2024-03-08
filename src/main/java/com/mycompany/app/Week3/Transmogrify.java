package com.mycompany.app.week3;

public interface Transmogrify {
    public abstract class Actor {
        public abstract void act();
       }
       public class HappyActor extends Actor {
        public void act() { 
            System.out.println("happy");
       }
    }
       public class SadActor extends Actor {
        public void act() { 
            System.out.println("Saddd");
       }
    }
       public class Stage {
        public Stage(){};
        Actor a = new HappyActor();
        public void change() { a = new SadActor(); }
        public void go() { a.act(); }
       }
    
}
       
