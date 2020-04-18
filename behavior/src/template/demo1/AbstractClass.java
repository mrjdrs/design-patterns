package template.demo1;

/**
 * 模板模式代码骨架
 *
 * @author zhoude
 * @date 2020/4/18 10:28
 */
public abstract class AbstractClass {

    /**
     * 这就是模板模式的算法骨架
     */
    public final void templateMethod() {
        // ......
        method1();
        // ......
        method2();
        // ......
    }

    /**
     * 算法骨架的具体步骤
     */
    protected abstract void method1();

    /**
     * 算法骨架的具体步骤
     */
    protected abstract void method2();
}