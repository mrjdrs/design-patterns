package state.demo2;

/**
 * @author zhoude
 * @date 2020/4/20 22:47
 */
public enum Event {
    /**
     * 获取蘑菇事件
     */
    GOT_MUSHROOM(0),

    /**
     * 获取斗篷事件
     */
    GOT_CAPE(1),

    /**
     * 获取火花事件
     */
    GOT_FIRE(2),

    /**
     * 遇见怪物事件
     */
    MET_MONSTER(3);

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
