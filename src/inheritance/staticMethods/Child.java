package inheritance.staticMethods;


public class Child extends Parent {

    static void staticMethod() {
        System.out.println("Child static");
    }

    @Override
    void instanceMethod() {
        System.out.println("Child instance");
    }
}
