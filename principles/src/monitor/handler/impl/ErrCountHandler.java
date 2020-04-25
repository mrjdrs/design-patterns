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
public class ErrCountHandler extends AlertHandler {
    public ErrCountHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrCount() > alertRule.maxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "err notify");
        }
    }
}
