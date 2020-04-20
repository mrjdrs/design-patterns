package state.demo2;

import state.State;

/**
 * @author zhoude
 * @date 2020/4/20 22:59
 */
public class Test {
    public static void main(String[] args) {
        MarioStateMachine2 mario = new MarioStateMachine2();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
