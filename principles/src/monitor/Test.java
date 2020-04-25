package monitor;

/**
 * @author zhoude
 * @date 2020/4/25 17:17
 */
public class Test {
    public static void main(String[] args) {
        Alter alter = new Alter(new AlterRule(), new Notification());
        alter.check("url", 10L, 10L, 10L);
    }
}
