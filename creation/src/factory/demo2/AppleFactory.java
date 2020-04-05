package factory.demo2;

import factory.Apple;
import factory.IFruit;

/**
 * @author zhoude
 * @date 2020/4/5 20:36
 */
public class AppleFactory implements IFruitFactory {

    @Override
    public IFruit createFruit() {
        return new Apple();
    }
}
