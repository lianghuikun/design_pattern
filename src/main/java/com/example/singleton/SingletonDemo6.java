package com.example.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉单例模式(如何防止反射和反序列化漏洞)
 */
// 序列化和反序列化，需要实现implements Serializable接口
public class SingletonDemo6 implements Serializable{
    private static SingletonDemo6 instance;
    private SingletonDemo6(){
      /*  // 防止反射破解单例，判断抛出异常，一般不需要考虑
        if (instance != null) {
            throw new RuntimeException();
        }*/
    }
    // 方法同步，调用效率低
    public static synchronized SingletonDemo6 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo6();
        }
        return instance;
    }
    /**
     * 如果定了readResolve方法，在反序列化时
     * 会直接返回readResolve方法中的对象，而不会去new
     * 这样就防止了反序列化的漏洞
     * 基于回调的，反序列化时会调用
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
