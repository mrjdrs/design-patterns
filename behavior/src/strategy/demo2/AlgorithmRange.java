package strategy.demo2;

/**
 * @author zhoude
 * @date 2020/4/19 10:51
 */
public class AlgorithmRange {
    private long start;
    private long end;
    private ISortAlgorithm sortAlgorithm;

    public AlgorithmRange(long start, long end, ISortAlgorithm sortAlgorithm) {
        this.start = start;
        this.end = end;
        this.sortAlgorithm = sortAlgorithm;
    }

    /**
     * 指定大小是否在范围[start, end)内
     *
     * @param size 指定大小
     * @return true=在范围内，false=不在范围内
     */
    public boolean inRange(long size) {
        return size >= start && size < end;
    }

    public ISortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }
}
