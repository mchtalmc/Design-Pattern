package CreationalDP.AbstractFactoryDP;

import CreationalDP.FactoryDP.Shape;

public class ColorFactory implements AbstractFactory{

    public Color getColor (String colorType){
        if (colorType.equalsIgnoreCase("mavi")){
            return new Blue();
        } else if (colorType.equalsIgnoreCase("kirmizi")) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
