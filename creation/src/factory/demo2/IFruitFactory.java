package factory.demo2;

import factory.IFruit;

/**
 * @author zhoude
 * @date 2020/4/5 20:36
 */
public interface IFruitFactory {

    /**
     * 创建水果
     *
     * @return 水果
     */
    IFruit createFruit();
}
