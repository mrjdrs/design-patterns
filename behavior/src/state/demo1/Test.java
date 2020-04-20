package state.demo1;

import state.State;

/**
 * @author zhoude
 * @date 2020/4/20 22:32
 */
public class Test {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
