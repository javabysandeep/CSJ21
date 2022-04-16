package oops.inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.vehicleId =101;
        twoWheeler.vehicleName="ola";
        twoWheeler.vehiclePrice = 100000;
        twoWheeler.numberOfWheels=2;

        System.out.println(twoWheeler.vehicleId);
        System.out.println(twoWheeler.vehicleName);
        System.out.println(twoWheeler.vehiclePrice);
        System.out.println(twoWheeler.numberOfWheels);

        Vehicle vehicle = new TwoWheeler();
        vehicle.vehicleId = 100;
        vehicle.vehicleName="vehicle";
        vehicle.vehiclePrice=30000;
//        vehicle.numberOfWheels=2;

//        TwoWheeler tv = new Vehicle();//CTE
    }
}
