package template.demo1;

/**
 * @author zhoude
 * @date 2020/4/18 10:32
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();

        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass2.templateMethod();
    }
}
