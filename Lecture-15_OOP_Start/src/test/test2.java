package test;

public class test2 {
    public static void main(String[] args){
        cat catty=new cat();
        //ye hair encapsulation
        catty.name="rock";
        catty.age=20;
        catty.breed="pug";

        Animal dog=new Dog();
        //ref h animal ka
        // this is polymorphism
        dog.makeSound();
    }
}
