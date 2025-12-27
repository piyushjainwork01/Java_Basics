package inheritance.staticMethods;

public class Test {

    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();  // Parent reference, Child object
        Child c = new Child();

        // Static methods - called based on reference type
        p1.staticMethod();  // Parent static
        p2.staticMethod();  // Parent static (NOT Child!)
        c.staticMethod();   // Child static

        // Instance methods - called based on object type
        p1.instanceMethod();  // Parent instance
        p2.instanceMethod();  // Child instance (polymorphism!)
        c.instanceMethod();   // Child instance
    }

    /*Key Learning:
TODO :
 static methods depend on reference type
 Instance methods depend on object type
 This is why we say static methods are "hidden" not "overridden"*/
}
