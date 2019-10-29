package cars;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(String name, double tankCapacity, double averageConsumption, boolean airConditioner) {
        super(name, tankCapacity, averageConsumption);
        this.airConditioner = airConditioner;
    }

    public boolean isAirConditioner() { return airConditioner; }
    public void setAirConditioner(boolean airConditioner) { this.airConditioner = airConditioner; }

    double consumption() {
        double avercons = getAverageConsumption();
        if (airConditioner){
            avercons += 0.8;
        }
        return avercons;
    }

    double carRange() {
        return getTankCapacity() / consumption() * 100;
    }


    @Override
    public String toString() {
        return "Car: " + getName() + ", tank: " + getTankCapacity() + ", consumption: " + consumption() +
                ", airConditioner: " + isAirConditioner() +", range: " + carRange();
    }

}
