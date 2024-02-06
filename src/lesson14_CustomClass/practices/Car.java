package lesson14_CustomClass.practices;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;


    public void  setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void start(){
        System.out.println("Starting from $"+price);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
