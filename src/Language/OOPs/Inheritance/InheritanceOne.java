package Language.OOPs.Inheritance;

public class InheritanceOne {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.methodOne();
        d1.methodTwo();
        d1.methodThree();
        d1.sayHi();
        System.out.println("class id is : " + d1.classId);
        d1.classId = "two";
        System.out.println(d1.classId);
    }
}
/* Parent class */
class Animal{

    /* fields */
    protected String classId = "one";

    void methodOne() {
        System.out.println("Default Method");
    }
    public void methodTwo() {
        System.out.println("Public Method");
    }
    protected void methodThree() {
        System.out.println("Protected Method");
    }
    private void methodFour() {
        System.out.println("Private Method");
    }
    public void sayHi() {
        System.out.println("Hi, From SuperClass.");
    }
}

/* Child class */
class Dog extends Animal{

    public void sayHi() {
        super.sayHi();
        System.out.println("Hi, From SubClass.");
    }
}

/* Types of Inheritance */
// Single Inheritance
class A{

}
class B extends A{

}


// Multi level Inheritance
class One{

}
class Two extends One{

}
class Three extends Two{

}
class Four extends Three{

}
class Five extends Four{

}

/* Hi.. Inheritance */
class Main{

}
/* two child */
class Secondary extends Main{

}
class Secondary2 extends Main{

}

/* Multiple Inheritance */
// Multiple inheritance in not supported in java but we can achieve this by using Interface
interface a{

}
interface b{

}
class Single implements a, b{

}

/* Hybrid Inheritance */
// Collection of all inheritance types

