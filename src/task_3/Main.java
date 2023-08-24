package task_3;
import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyAnnotation {
    String value();
}
@MyAnnotation("Главный класс")
class A {
    void display() {
        System.out.println("Это главный класс");
    }
}
class B extends A {
    @Override
    void display() {
        System.out.println("Это наследуемый класс");
    }
}
class C extends B {
    @Deprecated
    @Override
    void display() {
        System.out.println("Это наследуемый класс №2");
    }
}
class D extends C {
    @Override
    void display() {
        System.out.println("Это наследуемый класс №3");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.display();
        b.display();
        c.display();
        d.display();
    }
}
