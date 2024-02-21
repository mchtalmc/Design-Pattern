package StructuralDP.DecorateDP;

public class PhoneDecorater implements Phone{

    private Phone basicPhone;

    public PhoneDecorater(Phone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int getCameraCount() {
        return basicPhone.getCameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
