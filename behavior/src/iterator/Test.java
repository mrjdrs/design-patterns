package iterator;

import java.util.ArrayList;

/**
 * @author zhoude
 * @date 2020/4/22 21:58
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> number = new ArrayList<>();
        number.add("123");
        number.add("456");
        number.add("789");

        Iterator<String> iterator = new ArrayIterator<>(number);
        while (iterator.hasNext()) {
            System.err.println(iterator.currentItem());
            iterator.next();
        }
    }
}
