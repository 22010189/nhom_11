package com.mycompany.app.week3;

public interface DisturbLecture {
    public class CellPhone{
        public CellPhone(){}
    public void ring(Tune t){
t.play();    }   
    } 
    public class Tune{
        public Tune(){}
        public void play(){
            System.out.println("Ring");
        }
    }
    public class ObnoxiousTune extends Tune{
        public ObnoxiousTune(){}
    }    
}
