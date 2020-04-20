package state.demo3;

import state.State;

/**
 * @author zhoude
 * @date 2020/4/20 23:11
 */
public class CapeMario implements IMario {
    private MarioStateMachine3 marioState;

    public CapeMario(MarioStateMachine3 marioState) {
        this.marioState = marioState;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom() {
        // do something...
    }

    @Override
    public void obtainCape() {
        // do something...
    }

    @Override
    public void obtainFireFlower() {
        // do something...
    }

    @Override
    public void meetMonster() {
        marioState.setMario(new SmallMario(marioState));
        marioState.setScore(marioState.getScore() - 200);
    }
}
