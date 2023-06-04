package Language.OOPs.Inheritance;

class Parent{
    public void property() {
        System.out.println("ca$h,Gold and Land");
    }

    public void merry() {
        System.out.println("Arrange Marriage: Sunita");
    }
    public void career() {
        System.out.println("Government Officer");
    }
}

class Child extends Parent{
    @Override
    public void merry() {
        System.out.println("Love Marriage : katrina ");
    }

    @Override
    public void career() {
        System.out.println("Software Engineer @ Google");
    }
}

public class FunnyOverriding {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.property();
        p1.merry();
        p1.career();

        Child c = new Child();
        c.property();
        c.merry();
        c.career();

        System.out.println("----------//----------------");
        // Parent ref, child obj
        Parent p2 = new Child();
        p2.property();
        p2.merry();
        p2.career();

        // Child ref, Parent obj
        //Child c2 = new Parent();

    }
}
