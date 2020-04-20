package state.demo3;

import state.State;

/**
 * @author zhoude
 * @date 2020/4/20 23:11
 */
public class SmallMario implements IMario {
    private MarioStateMachine3 marioState;

    public SmallMario(MarioStateMachine3 marioState) {
        this.marioState = marioState;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        marioState.setMario(new SuperMario(marioState));
        marioState.setScore(marioState.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        marioState.setMario(new CapeMario(marioState));
        marioState.setScore(marioState.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        marioState.setMario(new FireMario(marioState));
        marioState.setScore(marioState.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        // do something...
    }
}
