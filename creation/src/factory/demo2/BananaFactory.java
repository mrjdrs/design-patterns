package factory.demo2;

import factory.Banana;
import factory.IFruit;

/**
 * @author zhoude
 * @date 2020/4/5 20:36
 */
public class BananaFactory implements IFruitFactory {

    @Override
    public IFruit createFruit() {
        return new Banana();
    }
}
