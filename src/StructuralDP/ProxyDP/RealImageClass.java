package StructuralDP.ProxyDP;

public class RealImageClass implements ImageGenerator{


    public String fullPath;


    public RealImageClass(String fullPath) {
        this.fullPath = fullPath;
        loadImage(); // OBJE OLUSTURULDUGUNDA RESIM DB'DEN YUKLENSIN.
    }

    @Override
    public void showImage() {
        System.out.println("Show Image" +fullPath);
    }

    public void loadImage(){
        System.out.println("Resim yukleniyor");
    }


}
