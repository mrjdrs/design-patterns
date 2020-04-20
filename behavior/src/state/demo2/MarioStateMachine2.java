package state.demo2;

import state.State;

import static state.State.CAPE;
import static state.State.FIRE;
import static state.State.SMALL;
import static state.State.SUPER;

/**
 * 查表法
 *
 * @author zhoude
 * @date 2020/4/20 22:36
 */
public class MarioStateMachine2 {
    /**
     * 积分
     */
    private int score;

    /**
     * 当前状态
     */
    private State currentState;

    private static final State[][] TRANSITION_TABLE = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] ACTION_TABLE = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachine2() {
        this.score = 0;
        this.currentState = SMALL;
    }

    /**
     * 获取蘑菇
     */
    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    /**
     * 获取斗篷
     */
    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    /**
     * 获取火花
     */
    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    /**
     * 遇见怪物
     */
    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = TRANSITION_TABLE[stateValue][eventValue];
        this.score = ACTION_TABLE[stateValue][eventValue];
    }

//  --------------------- getter and setter ---------------------

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}
