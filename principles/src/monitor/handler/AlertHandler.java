package monitor.handler;

import monitor.AlertRule;
import monitor.Notification;
import monitor.model.ApiStatInfo;

/**
 * @author zhoude
 * @date 2020/4/25 17:30
 */
public abstract class AlertHandler {
    protected AlertRule alertRule;
    protected Notification notification;

    public AlertHandler(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
