package polymorphism;

public class Cat extends Animal{


    Cat(String name) {
        super(name);
    }


    @Override
    void sound() {
        System.out.println(name + " meows: Meow Meow!");
    }

    void scratch() {
        System.out.println(name + " is scratching");
    }
}
