package strategy.demo2.impl;

import strategy.demo2.ISortAlgorithm;

/**
 * 文件[0, 6G)，使用快排
 *
 * @author zhoude
 * @date 2020/4/19 10:12
 */
public class QuickSort implements ISortAlgorithm {
    @Override
    public void sort(String filePath) {
        System.err.println("快排");
    }
}
