package CreationalDP.AbstractFactoryDP;

import CreationalDP.FactoryDP.Pentagon;
import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.Square;
import CreationalDP.FactoryDP.Triangle;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    public Shape getShape(String shapeType){  //EnumTYPE kullanmak best-practice
        if (shapeType.equalsIgnoreCase("ucgen")){
            return new Triangle("ucgen", 60,3);
        } else if (shapeType.equalsIgnoreCase("kare")) {
            return new Square("kare",90,4);
        } else if (shapeType.equalsIgnoreCase("besgen")) {
            return new Pentagon("Besgen",108,5);
        }
        return null;
    }
}
