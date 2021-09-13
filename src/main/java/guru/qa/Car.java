package guru.qa;

public class Car {
    String Model;
    String Equipment;
    String Color;
    double EngineCapacity;
    int HorsePower;
    boolean DieselEngine;
    int YearOfManufacture;

    public Car(String Model, String Equipment,String Color, double EngineCapacity, int HorsePower){
        this.Model = Model;
        this.Equipment = Equipment;
        this.Color = Color;
        this.EngineCapacity = EngineCapacity;
        this.HorsePower = HorsePower;
    }
    public Car(String Model, String Equipment, String Color, double EngineCapacity, int HorsePower,boolean DieselEngine){
        this.Model = Model;
        this.Equipment = Equipment;
        this.Color = Color;
        this.EngineCapacity = EngineCapacity;
        this.HorsePower = HorsePower;
        this.DieselEngine = DieselEngine;
    }
    public void setYearOfManufacture(int YearOfManufacture){
        this.YearOfManufacture = YearOfManufacture;
    }
    public int getYearOfManufacture(){
        return YearOfManufacture;
    }
    public void CarInfo(){
        System.out.println("It's a Kia " + Model + "\n" + Equipment + "\n" + Color);
    }
    public void TechnicalCharacteristic(){
        if (DieselEngine){
            System.out.println(EngineCapacity +"L Diesel" +"\n" + HorsePower + "Hp");
        }else
        System.out.println(EngineCapacity +"L" +"\n" + HorsePower + "Hp");
    }
    public void NewOrOld(){
        if(YearOfManufacture >= 2020) {
            System.out.println(getYearOfManufacture() + " New car");
        }else
            System.out.println(getYearOfManufacture() + " Old car");
    }

}







