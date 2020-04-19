package strategy.demo2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 排序类
 *
 * @author zhoude
 * @date 2020/4/19 10:41
 */
public class Sorter {
    private static final long GB = 1024 * 1024 * 1024;
    private static final long QUICK_SORT_SIZE = 6 * GB;
    private static final long EXTERNAL_SORT_SIZE = 10 * GB;
    private static final long CONCURRENT_EXTERNAL_SORT_SIZE = 100 * GB;
    private static final List<AlgorithmRange> RANGE_LIST = new ArrayList<>();

    static {
        RANGE_LIST.add(new AlgorithmRange(0, QUICK_SORT_SIZE, SortAlgorithmFactory.getSortAlgorithm("quickSort")));
        RANGE_LIST.add(new AlgorithmRange(QUICK_SORT_SIZE, EXTERNAL_SORT_SIZE, SortAlgorithmFactory.getSortAlgorithm("externalSort")));
        RANGE_LIST.add(new AlgorithmRange(EXTERNAL_SORT_SIZE, CONCURRENT_EXTERNAL_SORT_SIZE, SortAlgorithmFactory.getSortAlgorithm("concurrentExternalSort")));
        RANGE_LIST.add(new AlgorithmRange(CONCURRENT_EXTERNAL_SORT_SIZE, CONCURRENT_EXTERNAL_SORT_SIZE, SortAlgorithmFactory.getSortAlgorithm("mapreduceSort")));
    }

    /**
     * 获取文件排序策略类
     *
     * @param filePath 文件路径
     * @return 文件排序策略类
     */
    public void sort(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlgorithm sortAlgorithm = null;
        for (AlgorithmRange range : RANGE_LIST) {
            if (range.inRange(fileSize)) {
                sortAlgorithm = range.getSortAlgorithm();
                break;
            }
        }
        assert sortAlgorithm != null;
        sortAlgorithm.sort(filePath);
    }
}
