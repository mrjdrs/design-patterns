package strategy.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂，用于创建具体的策略算法
 * cache：策略类无状态不需要每次new一个新的
 *
 * @author zhoude
 * @date 2020/4/18 19:07
 */
public class StrategyFactoryCache {
    private static final Map<String, Strategy> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("A", new ConcreteStrategyA());
        STRATEGIES.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrateg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return STRATEGIES.get(type);
    }
}
