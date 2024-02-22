package StructuralDP.ProxyDP;

public class Runner {
    public static void main(String[] args) {
        RealImageClass real= new RealImageClass("C:\\PATH");
        //Obje olustugu zaman resim yukleniyor. Constructor icerisinde loadImage() kullandigim icin.


        ProxyImageClass proxy= new ProxyImageClass("C:\\PATH");
        //Obje olusturdum fakat RealImage'de oldugu gibi resim yukleme islemi gerceklestirmedim ve islemci , memory'de yer kaplamadim
        //RealImage objesinin yaptigi islemleri yapmak istersem , RealImageClass'i gibi davranir

        proxy.showImage();
        //RealImage' class'inin methodlarini kullanirsam , proxy gercek obje gibi davranmaya baslar.

    }
}
