package singleton.demo2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例-双重检测
 *
 * @author zhoude
 * @date 2020/4/4 16:25
 */
public class Double {

    private AtomicLong id = new AtomicLong(0);
    private static Double instance;

    private Double() {
    }

    public static Double getInstance() {
        if (instance == null) {
            synchronized (Double.class) {
                if (instance == null) {
                    instance = new Double();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
