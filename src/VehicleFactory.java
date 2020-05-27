
public class VehicleFactory {
    public Vehicle createVehicle(VehicleType type, String brand, String plate){
        Vehicle vehicle;
        switch (type){
            case UNREGISTEREDCAR:
                vehicle = new UnregisteredCar(plate,brand);
                break;
            case REGISTEREDCAR:
                vehicle = new RegisteredCar(plate,brand);
                break;
            case REGISTEREDTRUCK:
                vehicle = new RegisteredTruck(plate,brand);
                break;
            case UNREGISTEREDTRUCK:
                vehicle = new UnregisteredTruck(plate,brand);
                break;
            default:
                vehicle = null;
        }
        return vehicle;
    }
}
