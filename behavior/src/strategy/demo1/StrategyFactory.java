package strategy.demo1;

/**
 * 策略工厂，用于创建具体的策略算法
 * cache：策略类有状态需要每次new一个新的
 *
 * @author zhoude
 * @date 2020/4/18 19:07
 */
public class StrategyFactory {
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if ("A".equals(type)) {
            return new ConcreteStrategyA();
        } else if ("B".equals(type)) {
            return new ConcreteStrategyB();
        }

        return null;
    }
}
