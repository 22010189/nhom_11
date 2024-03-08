package com.mycompany.app.week3;

public interface GlyphTest {
    public abstract class Glyph {
        public abstract void draw();
        public Glyph() {
        System.out.println("before draw");
        draw();
        System.out.println("after draw");
        }
       }
       public class RoundGlyph extends Glyph {
        int radius = 1;
        public RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph(), radius=" + radius);
        }
        public void draw() {
        System.out.println("RoundGlyph.draw(), radius=" + radius);
        }
    
}
}
