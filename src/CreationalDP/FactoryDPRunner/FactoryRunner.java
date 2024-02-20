package CreationalDP.FactoryDPRunner;

import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.ShapeFactory;
import CreationalDP.FactoryDP.Square;

public class FactoryRunner {
    public static void main(String[] args) {

        //Shape shapee= new Square("kare,3,3"); // Erisemez.


        Shape shape= ShapeFactory.getShape("kare");
        shape.draw();
    }
}
