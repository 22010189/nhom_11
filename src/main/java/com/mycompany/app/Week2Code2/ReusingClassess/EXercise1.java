package com.mycompany.app.Week2Code2.ReusingClassess;

public class EXercise1 {
  public class FirstClass {
    private int value;

    void FirstClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


public class SecondClass {
    private FirstClass obj = null;

    public FirstClass getObj(int value) {
        if (obj == null) {
            obj.FirstClass(value);
        }
        return obj;
    }


    }
}

