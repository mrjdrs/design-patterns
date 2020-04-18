package strategy.demo1;

/**
 * 具体的策略B
 *
 * @author zhoude
 * @date 2020/4/18 19:03
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.err.println("具体的策略B算法的实现");
    }
}
