package CreationalDP.AbstractFactoryDP;

import CreationalDP.FactoryDP.Shape;

public interface AbstractFactory {

    Color getColor(String colorType);

    Shape getShape(String shapeType);
}
