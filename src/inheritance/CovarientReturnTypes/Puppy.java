package inheritance.CovarientReturnTypes;

public class Puppy extends Dog{

    @Override
    Puppy getAnimal() {  // Even more specific
        System.out.println("Returning Puppy");
        return new Puppy();
    }
}
