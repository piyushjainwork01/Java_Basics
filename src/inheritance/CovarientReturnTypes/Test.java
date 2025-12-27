package inheritance.CovarientReturnTypes;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Puppy p = new Puppy();

        Animal animal1 = a.getAnimal();  // Returns Animal
        Animal animal2 = d.getAnimal();  // Returns Dog (but stored as Animal)
        Dog dog = d.getAnimal();         // Returns Dog
        Puppy puppy = p.getAnimal();     // Returns Puppy

        // This shows polymorphism with covariant return types
        Animal animal3 = p.getAnimal();  // Puppy returned, stored as Animal
    }


    /* TODO :- Questions
    *   Q.1 : What is inheritance? Explain with a real-world example.
    *   Ans : Inheritance is an object-oriented concept where a child class acquires the properties and
    *         behaviors of a parent class.
              It represents an IS-A relationship and helps in code reuse, extensibility, and polymorphism.
    *   Q.2 : What are the three uses of the super keyword? Give code examples.
    *   Ans : The super keyword is used to access parent class variables, invoke parent class methods,
    *         and call parent class constructors.
    *   Q.3 : What is method overriding? How is it different from method overloading?
    *   Ans : When a class extends another class then acquires the properties and behaviours of a parent class,
    *         and if a class want to over ride those methods then it can also define those methods in his class,
    *         this phenomenon is k/as method overriding.
    *         Method overriding occurs when a child class provides its own implementation of a method that is already
    *         defined in the parent class, with the same method signature.
    *         Same method name
              Same parameter list
              Same or covariant return type
              Access modifier cannot be more restrictive
              Happens across inheritance
              It supports runtime polymorphism.
    *         Method overloading allows multiple methods with the same name but different parameters
    *         and is resolved at compile time.”
    *   */

}