package com.qinfengsa.pattern.factory.factorymethod;

import com.qinfengsa.pattern.factory.entity.INoteBook;
import com.qinfengsa.pattern.factory.entity.MateBook;

/**
 * 华为MateBook 工厂
 */
public class MateBookFactory implements INoteBookFactory {

    public INoteBook create() {
        return new MateBook();
    }
}
