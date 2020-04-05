package singleton.demo2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例-饿汉式
 *
 * @author zhoude
 * @date 2020/4/4 16:17
 */
public class HungryMan {

    private AtomicLong id = new AtomicLong(0);
    private static final HungryMan INSTANCE = new HungryMan();

    private HungryMan() {
    }

    public static HungryMan getInstance() {
        return INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
