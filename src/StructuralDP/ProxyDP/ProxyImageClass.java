package StructuralDP.ProxyDP;

public class ProxyImageClass implements ImageGenerator{

    private RealImageClass realImageClass;

    public String fullPath;

    public ProxyImageClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        if (realImageClass==null){
            this.realImageClass=new RealImageClass(fullPath);
            //Ilk defa cagriliyor obje olusturuyorum ve RealImage'i cagiriyorum
        }
        realImageClass.showImage();
        //Daha once obje olusturulduysa RealImage'in showImage methodunu kullaniyorum.
        //Yeni bir obje uretmiyorum(SingletonDP)
    }
}
