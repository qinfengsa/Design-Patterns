package com.qinfengsa.pattern.factory.entity;

/**
 *
 */
public class MatePhone implements ITelPhone {
    public void create() {
        System.out.println("华为Mate系列手机开始生产");
    }
}
