package StructuralDP.DecorateDP;

public class Iphone11Pro extends PhoneDecorater{
    public Iphone11Pro(Phone basicPhone) {
        super(basicPhone);
    }


    public String getModel(){
        return "11 Pro";
    }

    @Override
    public double getPrice() {
        return 25000;
    }
    public void roundCorner(){
        System.out.println("Corners are rounded");
    }


}
