package cars;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageConsumption;

    public Vehicle(String name, double tankCapacity, double averageConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageConsumption = averageConsumption;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getTankCapacity() { return tankCapacity; }
    public void setTankCapacity(double tankCapacity) { this.tankCapacity = tankCapacity; }
    public double getAverageConsumption() { return averageConsumption; }
    public void setAverageConsumption(double averageConsumption) { this.averageConsumption = averageConsumption; }

//    double range() {
//        double vehicleRange;
//        return tankCapacity / averageConsumption * 100;
//    }
}
