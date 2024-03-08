
package com.mycompany.app;
import com.mycompany.app.week2.B;
import com.mycompany.app.week3.*;
import com.mycompany.app.week3.PolymorphismExercise17.Bicycles;
import com.mycompany.app.week3.PolymorphismExercise17.Cycles;
import com.mycompany.app.week3.PolymorphismExercise17.Tricycles;
import com.mycompany.app.week3.PolymorphismExercise17.Unicycles;
public class App {
    public static void main(String[] args) {
        Cycles[] c = {new Unicycles(), new Bicycles(),new Tricycles()};
            ((Unicycles)c[0]).balance();
		    ((Bicycles)c[1]).balance();
    }
}
