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
public class TpsHandler extends AlertHandler {
    public TpsHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > alertRule.maxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "tps notify");
        }
    }
}
