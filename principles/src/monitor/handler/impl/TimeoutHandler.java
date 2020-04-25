package monitor.handler.impl;

import monitor.AlertRule;
import monitor.Notification;
import monitor.NotificationEmergencyLevel;
import monitor.handler.AlertHandler;
import monitor.model.ApiStatInfo;

/**
 * @author zhoude
 * @date 2020/4/25 17:32
 */
public class TimeoutHandler extends AlertHandler {
    public TimeoutHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getTimeout() > alertRule.maxTimeout()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "timeout notify");
        }
    }
}
