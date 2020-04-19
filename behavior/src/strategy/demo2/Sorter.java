package strategy.demo2;

import java.io.File;

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

    /**
     * 获取文件排序策略类
     *
     * @param filePath 文件路径
     * @return 文件排序策略类
     */
    public void sort(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();

        ISortAlgorithm sortAlgorithm;
        if (fileSize < QUICK_SORT_SIZE) {
            sortAlgorithm = SortAlgorithmFactory.getSortAlgorithm("quickSort");
        } else if (fileSize < EXTERNAL_SORT_SIZE) {
            sortAlgorithm = SortAlgorithmFactory.getSortAlgorithm("externalSort");
        } else if (fileSize < CONCURRENT_EXTERNAL_SORT_SIZE) {
            sortAlgorithm = SortAlgorithmFactory.getSortAlgorithm("concurrentExternalSort");
        } else {
            sortAlgorithm = SortAlgorithmFactory.getSortAlgorithm("mapreduceSort");
        }
        sortAlgorithm.sort(filePath);
    }
}
