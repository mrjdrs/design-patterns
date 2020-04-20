package state.demo3;

import state.State;

/**
 * @author zhoude
 * @date 2020/4/20 23:09
 */
public interface IMario {
    /**
     * 获取马里奥的名称
     *
     * @return 马里奥状态
     */
    State getName();

    /**
     * 获取蘑菇
     */
    void obtainMushRoom();

    /**
     * 获取斗篷
     */
    void obtainCape();

    /**
     * 获取火花
     */
    void obtainFireFlower();

    /**
     * 遇见怪物
     */
    void meetMonster();
}
