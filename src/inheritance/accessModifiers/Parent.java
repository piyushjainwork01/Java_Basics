package inheritance.accessModifiers;

public class Parent {

    private void privateMethod() {
        System.out.println("Private");
    }

    protected void protectedMethod() {
        System.out.println("Protected");
    }

    public void publicMethod() {
        System.out.println("Public");
    }
}
