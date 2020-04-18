package strategy.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 测试类
 *
 * @author zhoude
 * @date 2020/4/18 19:16
 */
public class Test {
    public static void main(String[] args) throws IOException {
        configLoad();
        staticLoad();
    }

    /**
     * 通过加载配置方式方式，动态获取策略类
     *
     * @throws IOException exception
     */
    private static void configLoad() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("behavior/src/strategy/strategy.properties"));
        String type = properties.getProperty("strategy.config");
        Strategy strategy = StrategyFactoryCache.getStrateg(type);
        strategy.algorithmInterface();
    }

    /**
     * 静态指定策略类
     */
    private static void staticLoad() {
        Strategy strategy = StrategyFactory.getStrateg("B");
        if (strategy != null) {
            strategy.algorithmInterface();
        }
    }
}