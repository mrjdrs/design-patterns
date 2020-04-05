package factory.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoude
 * @date 2020/4/5 20:43
 */
public class FruitFactoryMap {

    private static final Map<String, IFruitFactory> FRUIT_MAP = new HashMap<>();

    static {
        FRUIT_MAP.put("apple", new AppleFactory());
        FRUIT_MAP.put("banana", new BananaFactory());
    }

    public static IFruitFactory createFruitFactory(String category) {
        if (category == null || category.isEmpty()) {
            throw new RuntimeException("exception");
        }

        return FRUIT_MAP.get(category);
    }
}
