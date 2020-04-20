package state;

/**
 * @author zhoude
 * @date 2020/4/20 22:17
 */
public enum State {
    /**
     * 小马里奥
     */
    SMALL(0),

    /**
     * 超级马里奥
     */
    SUPER(1),

    /**
     * 火焰马里奥
     */
    FIRE(2),

    /**
     * 斗篷马里奥
     */
    CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
