package strategy.demo2;

import strategy.demo2.impl.ConcurrentExternalSort;
import strategy.demo2.impl.ExternalSort;
import strategy.demo2.impl.MapreduceSort;
import strategy.demo2.impl.QuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * 文件排序工厂类
 *
 * @author zhoude
 * @date 2020/4/19 10:15
 */
public class SortAlgorithmFactory {
    private static final Map<String, ISortAlgorithm> SORT_ALGORITHM = new HashMap<>();

    static {
        SORT_ALGORITHM.put("quickSort", new QuickSort());
        SORT_ALGORITHM.put("externalSort", new ExternalSort());
        SORT_ALGORITHM.put("concurrentExternalSort", new ConcurrentExternalSort());
        SORT_ALGORITHM.put("mapreduceSort", new MapreduceSort());
    }

    public static ISortAlgorithm getSortAlgorithm(String algorithm) {
        if (algorithm == null || algorithm.isEmpty()) {
            throw new IllegalArgumentException("algorithm should not be empty.");
        }
        return SORT_ALGORITHM.get(algorithm);
    }
}
