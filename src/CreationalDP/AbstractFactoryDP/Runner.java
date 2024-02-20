package CreationalDP.AbstractFactoryDP;

import CreationalDP.FactoryDP.Shape;

public class Runner {
    public static void main(String[] args) {

        AbstractFactory sp=FactoryProducer.getFactory("SHAPE");
        Shape shape= sp.getShape("kare");
        shape.draw();

       AbstractFactory cf= FactoryProducer.getFactory("COLOR");
       Color color=cf.getColor("mavi");
       color.fill();
    }
}
