package factory.demo1;

import factory.IFruit;

/**
 * @author zhoude
 * @date 2020/4/5 20:37
 */
public class Demo1Test {

    public static void main(String[] args) {
        IFruit apple = FruitFactory.createFruit("apple");
        System.err.println(apple.getColor());

        IFruit banana = FruitFactory.createFruit("banana");
        System.err.println(banana.getColor());
    }
}
