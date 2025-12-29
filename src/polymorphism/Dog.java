package polymorphism;

public class Dog extends  Animal{


    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " barks: Woof Woof!");
    }
    void fetch(){
        System.out.println(name + " is fetching the ball");
    }
}
