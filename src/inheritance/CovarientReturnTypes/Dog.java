package inheritance.CovarientReturnTypes;

public class Dog extends Animal {
    @Override
    Dog getAnimal() {  // Covariant return type
        System.out.println("Returning Dog");
        return new Dog();
    }
}

