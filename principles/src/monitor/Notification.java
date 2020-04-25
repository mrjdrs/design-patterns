package monitor;

import java.text.MessageFormat;

/**
 * 警告通知
 *
 * @author zhoude
 * @date 2020/4/25 17:05
 */
public class Notification {
    /**
     * 发送警告通知
     *
     * @param level 通知等级
     * @param msg   通知消息
     */
    public void notify(NotificationEmergencyLevel level, String msg) {
        // 伪实现
        System.err.println(MessageFormat.format("发送了警告通知；level={0}，msg={1}", level.name(), msg));
    }
}
