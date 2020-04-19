package strategy.demo2.impl;

import strategy.demo2.ISortAlgorithm;

/**
 * 文件[6G, 10G)，使用外部排序
 *
 * @author zhoude
 * @date 2020/4/19 10:12
 */
public class ExternalSort implements ISortAlgorithm {
    @Override
    public void sort(String filePath) {
        System.err.println("外部排序");
    }
}
