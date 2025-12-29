package polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {
        System.out.println("=== Without Polymorphism ===");
        Dog d = new Dog("Buddy");
        Cat c = new Cat("Whiskers");
        Cow cow = new Cow("Bessie");

        d.sound();
        c.sound();
        cow.sound();

        System.out.println("=== With Polymorphism ===");
        Animal a1 = new Dog("Max");
        Animal a2 = new Cat("Fluffy");
        Animal a3 = new Cow("Molly");

        a1.sound();  // Calls Dog's sound()
        a2.sound();  // Calls Cat's sound()
        a3.sound();  // Calls Cow's sound()

        System.out.println("\n=== Array of Animals ===");
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Rex");
        animals[1] = new Cat("Mittens");
        animals[2] = new Dog("Bruno");
        animals[3] = new Cow("Daisy");
        animals[4] = new Cat("Shadow");

        // Loop through and call sound() - each behaves differently!
        for (Animal a : animals) {
            a.sound();
        }

        System.out.println("\n=== What can we access? ===");
        Animal a4 = new Dog("Charlie");
        a4.sound();  // ✅ Works - Animal has sound()
        a4.eat();    // ✅ Works - Animal has eat()
        // Compile time error since animal do not have fetch function a4.fetch()

        // TODO :  To call fetch(), we need to downcast
        Dog d2 = (Dog) a4;
        d2.fetch();  // ✅ Now works!

        makeAnimalSound(new Dog("Rocky"));
        makeAnimalSound(new Cat("Luna"));
        makeAnimalSound(new Cow("Buttercup"));
    }

    static void makeAnimalSound(Animal a) {
        a.sound();
    }
}
