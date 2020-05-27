
public class Main {
    public static void main(String[] args) {
            VehicleFactory vf = new VehicleFactory();

            Vehicle v = vf.createVehicle(VehicleType.UNREGISTEREDCAR,"Peugeot","123456AB");
            System.out.println(v);





    }
}
