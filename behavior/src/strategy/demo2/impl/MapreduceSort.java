package strategy.demo2.impl;

import strategy.demo2.ISortAlgorithm;

/**
 * 文件[100G, +无穷)，使用MapReduce多机排序
 *
 * @author zhoude
 * @date 2020/4/19 10:12
 */
public class MapreduceSort implements ISortAlgorithm {
    @Override
    public void sort(String filePath) {
        System.err.println("MapReduce多机排序");
    }
}
