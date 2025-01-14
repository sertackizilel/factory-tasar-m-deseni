
// Üst sınıf veya arayüz
interface Vehicle {
    void drive(); // Tüm araçların sahip olması gereken drive metodu
}

// Alt sınıflar (Concrete Classes)
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving"); // Car nesnesi için drive metodu
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is driving"); // Truck nesnesi için drive metodu
    }
}

// Fabrika Sınıfı
class VehicleFactory {
    public Vehicle createVehicle(String type) { // Aracın türüne göre nesne döndürür
        if (type.equalsIgnoreCase("Car")) {
            return new Car(); // Eğer tür Car ise Car nesnesi döndürülür
        } else if (type.equalsIgnoreCase("Truck")) {
            return new Truck(); // Eğer tür Truck ise Truck nesnesi döndürülür
        }
        return null; // Geçersiz türde null döner
    }
}

// Kullanım
public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory(); // Fabrika nesnesi oluşturuluyor
        
        Vehicle car = factory.createVehicle("Car"); // Car türünde nesne oluşturuluyor
        car.drive(); // Çıktı: "Car is driving"
        
        Vehicle truck = factory.createVehicle("Truck"); // Truck türünde nesne oluşturuluyor
        truck.drive(); // Çıktı: "Truck is driving"
    }
}
