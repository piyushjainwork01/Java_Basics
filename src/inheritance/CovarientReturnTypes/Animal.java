package inheritance.CovarientReturnTypes;

public class Animal {

    Animal getAnimal() {
        System.out.println("Returning Animal");
        return new Animal();
    }
}
