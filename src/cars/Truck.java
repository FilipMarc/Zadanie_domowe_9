package cars;

public class Truck extends Car{
    private double loadWeight;

    public Truck(String name, double tankCapacity, double averageConsumption,
                 boolean airConditioner, double loadWeight) {
        super(name, tankCapacity, averageConsumption, airConditioner);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() { return loadWeight; }
    public void setLoadWeight(double loadWeight) { this.loadWeight = loadWeight; }

    @Override
    double consumption() {
        double cons = getAverageConsumption();
        if (isAirConditioner()){
            cons += 1.6;
        }
        cons += 0.5 * loadWeight / 100;
        return cons;

    }
    @Override
    double carRange() {
    return super.carRange();
    }

    @Override
    public String toString() {
        return "Truck: " + getName() + ", tank: " + getTankCapacity() + ", consumption: " + consumption() +
                ", airConditioner: " + isAirConditioner() +", range: " + carRange();
    }
}
