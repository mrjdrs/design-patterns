package singleton.demo2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例-枚举
 *
 * @author zhoude
 * @date 2020/4/4 16:27
 */
public enum Enum {

    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
