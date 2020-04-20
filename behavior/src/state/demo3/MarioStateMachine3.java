package state.demo3;

/**
 * 查表法
 *
 * @author zhoude
 * @date 2020/4/20 22:36
 */
public class MarioStateMachine3 {
    /**
     * 积分
     */
    private int score;

    /**
     * 马里奥事件接口
     */
    private IMario mario;

    public MarioStateMachine3() {
        this.score = 0;
        this.mario = new SmallMario(this);
    }

    /**
     * 获取蘑菇
     */
    public void obtainMushRoom() {
        mario.obtainMushRoom();
    }

    /**
     * 获取斗篷
     */
    public void obtainCape() {
        mario.obtainCape();
    }

    /**
     * 获取火花
     */
    public void obtainFireFlower() {
        mario.obtainFireFlower();
    }

    /**
     * 遇见怪物
     */
    public void meetMonster() {
        mario.meetMonster();
    }

//  --------------------- getter and setter ---------------------

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IMario getMario() {
        return mario;
    }

    public void setMario(IMario mario) {
        this.mario = mario;
    }
}
