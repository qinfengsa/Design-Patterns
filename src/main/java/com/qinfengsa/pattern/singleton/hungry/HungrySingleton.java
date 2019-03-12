package com.qinfengsa.pattern.singleton.hungry;

/**
 * 饿汉式，不管用不用，先实例化出来再说
 * @author: qinfengsa
 * @date: 2019/3/11 00:15
 */
public class HungrySingleton {
    /**
     * static 关键字 静态变量类加载阶段就会初始化
     * final 保证实例不会在运行过程中被篡改
     */
    private static final HungrySingleton singleton = new HungrySingleton();

    /**
     * 构造方法私有化，防止被实例化
     */
    private HungrySingleton() {};

    /**
     * 获取单例方法，如果不是静态方法，会调用不了,
     * 非静态方法只有在类实例化之后才能调用
     * @return
     */
    public static HungrySingleton getInstance() {
        return singleton;
    }


}
