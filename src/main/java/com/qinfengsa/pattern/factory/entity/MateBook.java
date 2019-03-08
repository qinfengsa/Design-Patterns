package com.qinfengsa.pattern.factory.entity;

/**
 * 华为MateBook
 */
public class MateBook implements INoteBook {
    public void create() {
        System.out.println("华为MateBook开始生产");
    }
}
