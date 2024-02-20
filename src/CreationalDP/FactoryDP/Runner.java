package CreationalDP.FactoryDP;

public class Runner {
    public static void main(String[] args) {
        Pentagon pentagon= new Pentagon("Besgen", 108 , 5);
        pentagon.draw();
        Square square= new Square("Kare", 90 ,4);
        square.draw();
        Triangle triangle= new Triangle("Ucgen", 60 , 3);
        triangle.draw();

        //Objeyi kullanirken detaylari bilmen gerekiyor.

        //----------------------FACTORY DP--------------------------

        Shape fp1=ShapeFactory.getShape("ucgen");
        fp1.draw();

        Shape fp2= ShapeFactory.getShape("kare");
        fp2.draw();



    }
}
