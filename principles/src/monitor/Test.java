package monitor;

import monitor.handler.impl.ErrCountHandler;
import monitor.handler.impl.TimeoutHandler;
import monitor.handler.impl.TpsHandler;
import monitor.model.ApiStatInfo;

/**
 * @author zhoude
 * @date 2020/4/25 17:17
 */
public class Test {
    public static void main(String[] args) {
        AlertRule alertRule = new AlertRule();
        Notification notification = new Notification();

        Alert alert = new Alert();
        alert.addHandler(new TpsHandler(alertRule, notification));
        alert.addHandler(new ErrCountHandler(alertRule, notification));
        alert.addHandler(new TimeoutHandler(alertRule, notification));
        alert.check(buildApiStatInfo());
    }

    private static ApiStatInfo buildApiStatInfo() {
        ApiStatInfo result = new ApiStatInfo();
        result.setApi("url");
        result.setRequestCount(10L);
        result.setErrCount(10L);
        result.setTimeout(10L);
        result.setDurationOfSeconds(10L);
        return result;
    }
}
