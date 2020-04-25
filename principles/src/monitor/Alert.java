package monitor;

import monitor.handler.AlertHandler;
import monitor.model.ApiStatInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoude
 * @date 2020/4/25 17:04
 */
public class Alert {
    private List<AlertHandler> handlers = new ArrayList<>();

    public void addHandler(AlertHandler handler) {
        handlers.add(handler);
    }

    /**
     * 检查API警告
     *
     * @param apiStatInfo api统计model
     */
    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : handlers) {
            handler.check(apiStatInfo);
        }
    }
}
