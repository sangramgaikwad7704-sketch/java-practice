public class Car {
    String brand;
    String model;
    int price;

    Car(String brand){
        this("Toyota",null,0);

    }

    Car(String brand, String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public static void main(String[] args) {
        Car c1= new Car();
        System.out.println(c1.brand);
        System.out.println(c1.price);

    }
}
