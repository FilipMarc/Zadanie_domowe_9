package cars;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[3];
        cars[0] =  new Car("Paserati",60.0,8.0,false);
        cars[1] =  new Car("BMW",50.0,9.0,false);
        cars[2] =  new Truck("Volvo",180,14.0,false,500);

        for (Vehicle vehicle : cars) {
            System.out.println(vehicle);
        }

        System.out.println("--------------------------------------------------------------------------------------");

        cars[0] =  new Car("Paserati",60.0,8.0,true);
        cars[1] =  new Car("BMW",50.0,9.0,true);
        cars[2] =  new Truck("Volvo",180,14.0,true,500);

        for (Vehicle vehicle : cars) {
            System.out.println(vehicle);
        }
    }
}
