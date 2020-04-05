package factory.demo1;

import factory.Apple;
import factory.Banana;
import factory.IFruit;

/**
 * @author zhoude
 * @date 2020/4/5 20:31
 */
public class FruitFactory {

    public static IFruit createFruit(String category) {
        if ("apple".equals(category)) {
            return new Apple();
        } else if ("banana".equals(category)) {
            return new Banana();
        }

        throw new RuntimeException("exception");
    }
}
