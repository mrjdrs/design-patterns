package factory.demo2;

import factory.IFruit;

/**
 * @author zhoude
 * @date 2020/4/5 20:42
 */
public class Demo2Test {

    public static void main(String[] args) {
        IFruitFactory appleFactory = FruiteFacoryMap.createFruitFactory("apple");
        IFruit apple = appleFactory.createFruit();
        System.err.println(apple.getColor());

        IFruitFactory bananaFactory = FruiteFacoryMap.createFruitFactory("banana");
        IFruit banana = bananaFactory.createFruit();
        System.err.println(banana.getColor());
    }
}
