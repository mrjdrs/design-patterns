package adapter.demo1;

/**
 * @author zhoude
 * @date 2020/4/11 12:26
 */
public class Adaptor extends Adaptee implements IAdapter {

    @Override
    public void func1() {
        super.f1();
    }

    @Override
    public void func2() {
        // 重新实现fund2的逻辑
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
