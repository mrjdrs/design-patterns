package template.demo1;

/**
 * 模板模式代码骨架
 *
 * @author zhoude
 * @date 2020/4/18 10:28
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        // ......
        method1();
        // ......
        method2();
        // ......
    }

    protected abstract void method1();

    protected abstract void method2();
}