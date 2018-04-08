package hw8_16_02_18_Patern.PaternDecorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend PaternDecorator";
    }
    @Override
    public double cost() {
        return .89;
    }
}