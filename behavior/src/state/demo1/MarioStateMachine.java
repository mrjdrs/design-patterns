package state.demo1;

import state.State;

/**
 * 分支逻辑法
 *
 * @author zhoude
 * @date 2020/4/20 22:19
 */
public class MarioStateMachine {
    /**
     * 积分
     */
    private int score;

    /**
     * 当前状态
     */
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    /**
     * 获取蘑菇
     */
    public void obtainMushRoom() {
        if (currentState == State.SMALL) {
            score += 100;
            currentState = State.SUPER;
        }
    }

    /**
     * 获取斗篷
     */
    public void obtainCape() {
        if (currentState == State.SMALL || currentState == State.SUPER) {
            score += 200;
            currentState = State.CAPE;
        }
    }

    /**
     * 获取火花
     */
    public void obtainFireFlower() {
        if (currentState == State.SMALL || currentState == State.SUPER) {
            score += 300;
            currentState = State.FIRE;
        }
    }

    /**
     * 遇见怪物
     */
    public void meetMonster() {
        if (currentState == State.SUPER) {
            score -= 100;
            currentState = State.SMALL;
            return;
        }
        if (currentState == State.CAPE) {
            score -= 200;
            currentState = State.SMALL;
            return;
        }
        if (currentState == State.FIRE) {
            score -= 300;
            currentState = State.SMALL;
        }
    }

//  --------------------- getter and setter ---------------------

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}
