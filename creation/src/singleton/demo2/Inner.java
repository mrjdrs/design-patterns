package singleton.demo2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例-内部类
 *
 * @author zhoude
 * @date 2020/4/4 16:27
 */
public class Inner {

    private AtomicLong id = new AtomicLong(0);

    private Inner() {
    }

    private static class SingletonHolder {
        private static final Inner INSTANCE = new Inner();
    }

    public static Inner getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
