package inheritance.accessModifiers;

public class Child extends Parent {

    @Override
    protected void protectedMethod() {
        System.out.println("Child protected");
    }

    // This WILL compile - more accessible (protected → public)
    @Override
    public void publicMethod() {
        System.out.println("Child public");
    }

    //  Now try this - will it compile?
    //     @Override
    //     protected void publicMethod() {  // Less accessible - ERROR!
    //         System.out.println("Wrong");
    //     }
}
