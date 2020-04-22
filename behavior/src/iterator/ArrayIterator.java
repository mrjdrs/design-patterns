package iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author zhoude
 * @date 2020/4/22 21:55
 */
public class ArrayIterator<E> implements Iterator<E> {
    /**
     * 游标
     */
    private int index;

    /**
     * 容器集合
     */
    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        this.index = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        // 注意这里，cursor在指向最后一个元素的时候，hasNext()仍旧返回true。 }
        return index != arrayList.size();
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public E currentItem() {
        if (index >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(index);
    }
}
