package StructuralDP.DecorateDP;

public class Runner {
    public static void main(String[] args) {
        //Mevcut Obje
        Iphone iphone = new Iphone();
        System.out.println(iphone.getName());
        System.out.println(iphone.getCameraCount());
        System.out.println(iphone.getPrice());

        System.out.println("Decorated DP");

        Iphone11Pro iphone11Pro= new Iphone11Pro(new Iphone());
        System.out.println(iphone11Pro.getName());
        System.out.println(iphone11Pro.getModel());
        System.out.println(iphone11Pro.getCameraCount());
        System.out.println(iphone11Pro.getPrice());
        iphone11Pro.roundCorner();

        System.out.println("Decorated DP Pro Max");

        Iphone11ProMax iphone11ProMax= new Iphone11ProMax(new Iphone());
        System.out.println(iphone11ProMax.setColor());
        System.out.println(iphone11ProMax.getModel());
        System.out.println(iphone11ProMax.getName());

    }
}
