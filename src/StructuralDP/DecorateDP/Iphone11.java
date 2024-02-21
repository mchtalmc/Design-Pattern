package StructuralDP.DecorateDP;

public class Iphone11 extends PhoneDecorater {
    public Iphone11(Phone basicPhone) {
        super(basicPhone);
    }
    public String getModel(){
        return "11";
    }
    //Diger islevler ya da ozellikler basicPhone(Mevcut obje)'den gelecek ,  getModel() ile extra bir ozellik ekedim.

}
