package pattern.composite2;

import java.util.ArrayList;
import java.util.List;

// Component
public interface Graphic {
    public void print();
}

// Composite
class CompositeGraphic implements Graphic {
    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

    public void print() {
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }
}

// Leaf
class Ellipse implements Graphic {
    public void print() {
        System.out.println("Ellipse");
    }
}

//public class Program {
//    public static void main(String[] args) {
//        Ellipse ellipse1 = new Ellipse();
//
//        CompositeGraphic graphic = new CompositeGraphic();
//    }
//}