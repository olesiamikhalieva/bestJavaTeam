package task11;

public class Larry extends Car {
    private int carryingCapacity;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void changeCarryingCapacity(char operation, int number){
        switch (operation){
            case '+':
                this.carryingCapacity += number;
                break;
            case '-':
                this.carryingCapacity -= number;
                break;
        }
    }
    public void setNewBrand(String brand){
        super.setBrand(brand);
    }
}
