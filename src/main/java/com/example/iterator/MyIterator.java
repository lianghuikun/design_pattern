package com.example.iterator;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/29/029 13:34
 */
public interface MyIterator {
    /**
     * 将游标指向第一个元素
     */
    void first();

    /**
     * 将游标指向下一个
     */
    void next();

    boolean hasNext();

    boolean isFirst();

    boolean isLast();

    /**
     * 获得当前对象
     *
     * @return
     */
    Object getCurrentObj();
}
