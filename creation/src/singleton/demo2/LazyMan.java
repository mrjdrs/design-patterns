package singleton.demo2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例-饿汉式
 *
 * @author zhoude
 * @date 2020/4/4 16:21
 */
public class LazyMan {

    private AtomicLong id = new AtomicLong(0);
    private static LazyMan instance;

    private LazyMan() {
    }

    public static synchronized LazyMan getInstance() {
        if (instance == null) {
            instance = new LazyMan();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
