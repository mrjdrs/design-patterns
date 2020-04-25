package monitor;

/**
 * @author zhoude
 * @date 2020/4/25 17:04
 */
public class Alter {
    private AlterRule alterRule;
    private Notification notification;

    public Alter(AlterRule alterRule, Notification notification) {
        this.alterRule = alterRule;
        this.notification = notification;
    }

    /**
     * 检查API警告
     *
     * @param api               api url
     * @param requestCount      请求次数
     * @param errCount          错误次数
     * @param durationOfSeconds 持续时间（单位秒）
     */
    public void check(String api, long requestCount, long errCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > alterRule.maxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "tps notify");
        }
        if (errCount > alterRule.maxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "err notify");
        }
    }
}
