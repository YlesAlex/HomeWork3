package guru.qa;

public class Main {

    public static void main(String[] args) {
        Car Kia1 = new Car("Rio", "Prestige", "Black" ,1.6, 123 );
        Kia1.setYearOfManufacture(2013);
        Kia1.CarInfo();
        Kia1.TechnicalCharacteristic();
        Kia1.NewOrOld();
        Car Kia2 = new Car("Sportage", "Premium", "Red", 2.0 , 185 ,true);
        Kia2.setYearOfManufacture(2021);
        Kia2.CarInfo();
        Kia2.TechnicalCharacteristic();
        Kia2.NewOrOld();
    }

}
