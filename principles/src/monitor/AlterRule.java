package monitor;

/**
 * 警告规则
 *
 * @author zhoude
 * @date 2020/4/25 17:05
 */
public class AlterRule {
    public long maxTps() {
        // 假设这是tps阀值
        return 0;
    }

    public long maxErrorCount() {
        // 假设这是error阀值
        return 200;
    }
}
