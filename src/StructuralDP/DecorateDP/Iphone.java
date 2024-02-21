package StructuralDP.DecorateDP;

public class Iphone implements Phone{
    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public int getCameraCount() {
        return 3;
    }

    @Override
    public double getPrice() {
        return 15000;
    }
}
