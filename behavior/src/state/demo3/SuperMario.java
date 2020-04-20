package state.demo3;

import state.State;

/**
 * @author zhoude
 * @date 2020/4/20 23:11
 */
public class SuperMario implements IMario {
    private MarioStateMachine3 marioState;

    public SuperMario(MarioStateMachine3 marioState) {
        this.marioState = marioState;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom() {
        // do something...
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
        marioState.setMario(new SmallMario(marioState));
        marioState.setScore(marioState.getScore() - 100);
    }
}
