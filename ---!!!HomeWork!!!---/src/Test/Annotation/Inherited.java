package Test.Annotation;

public class Inherited extends Parent {

    @Override
    public void method() {
        this.method1();
    }

    @Deprecated
    public void method1() {

    }
}
