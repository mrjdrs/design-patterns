package iterator;

/**
 * @author zhoude
 * @date 2020/4/22 21:53
 */
public interface Iterator<E> {
    /**
     * 是否有下一个元素
     *
     * @return true=有，false=无
     */
    boolean hasNext();

    /**
     * 游标后移
     */
    void next();

    /**
     * 获取当前元素
     *
     * @return 当前元素
     */
    E currentItem();
}
