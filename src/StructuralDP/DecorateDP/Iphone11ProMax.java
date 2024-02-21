package StructuralDP.DecorateDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getModel() {
        return "Iphone 11 Pro Max";
    }

    @Override
    public double getPrice() {
        return 30000;
    }
    public String setColor(){
        return "Gold";
    }
}
