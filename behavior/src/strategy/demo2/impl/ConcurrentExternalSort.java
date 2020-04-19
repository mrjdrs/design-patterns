package strategy.demo2.impl;

import strategy.demo2.ISortAlgorithm;

/**
 * 文件[10G, 100G)，使用多线程外部排序
 *
 * @author zhoude
 * @date 2020/4/19 10:12
 */
public class ConcurrentExternalSort implements ISortAlgorithm {
    @Override
    public void sort(String filePath) {
        System.err.println("多线程外部排序");
    }
}
