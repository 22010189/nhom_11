package com.mycompany.app.week3;

public interface PolymorphismExercise17 {
    
public class Cycles{
    public Cycles(){}
	
}

public class Unicycles extends Cycles{
	public Unicycles(){}
	public void balance(){
		System.out.println("Balancing on Unicycles" );
	}
}

public class Bicycles extends Cycles{
	public Bicycles(){}
	public void balance(){
		System.out.println("Balancing on Bicycle" );
		}
}
	
public class Tricycles extends Cycles{
	public Tricycles(){}
}
}
