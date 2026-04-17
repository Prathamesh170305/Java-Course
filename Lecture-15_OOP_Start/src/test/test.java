package test;

public class test {
    public static void main(String[] args){
        Car car=new Car();
        car.color="black";
        car.speed=40;
        car.brand="tata";
        car.year=2024;
        car.model="safari";

        car.accelerate(20);
        System.out.println(car.speed);
    }
}
