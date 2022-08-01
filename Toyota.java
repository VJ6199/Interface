public class Toyota implements Inter {


    @Override
    public void vehiclemodel() {
        System.out.println("Toyota model 2020");
    }

    @Override
    public String vehicleName() {
        return "corolla";
    }

    @Override
    public String vehicleType() {
        return "Hybrid";
    }
    String vehicleowner(){
        return "Ram";
    }
}
class Tesla implements Inter {


    @Override
    public void vehiclemodel() {
        System.out.println("Tesla model 2020");
    }

    @Override
    public String vehicleName() {
        return "Tesla X";
    }

    @Override
    public String vehicleType() {
        return "Electric";
    }
    int price(){
        return 20000;
    }
}
class Interfacee{
    public static void main(String [] args){
        Toyota car = new Toyota();
        car.vehiclemodel();
        System.out.println(car.vehicleName());
        System.out.println(car.vehicleType());
        System.out.println(car.vehicleowner());
         Tesla cars = new Tesla();
        cars.vehiclemodel();
        System.out.println(cars.vehicleName());
        System.out.println(cars.vehicleType());
        System.out.println(cars.price());
    }
}