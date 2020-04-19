package strategy.demo2;

/**
 * 文件排序策略
 *
 * @author zhoude
 * @date 2020/4/19 10:11
 */
public interface ISortAlgorithm {
    /**
     * 文件排序
     *
     * @param filePath 文件路径
     */
    void sort(String filePath);
}
