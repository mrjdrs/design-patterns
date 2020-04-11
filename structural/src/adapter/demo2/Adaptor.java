package adapter.demo2;

/**
 * @author zhoude
 * @date 2020/4/11 12:26
 */
public class Adaptor implements IAdapter {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void func1() {
        // 委托给adaptee实现
        adaptee.f1();
    }

    @Override
    public void func2() {
        // 重写func2
    }

    @Override
    public void func3() {
        // 委托给adaptee实现
        adaptee.func3();
    }
}
