package com.example.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        /*SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();
        System.out.println(s1);
        System.out.println(s2);*/
        /**
         *  通过反射跳过单例
         */
   /*     Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("com.example.singleton.SingletonDemo6");
        // 获取无参构造器
        Constructor<SingletonDemo6> constructor = clazz.getDeclaredConstructor(null);
        // 暴力破解
        constructor.setAccessible(true);
        SingletonDemo6 s3 = constructor.newInstance();
        SingletonDemo6 s4 = constructor.newInstance();
        System.out.println(s3);
        System.out.println(s4);*/

        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        // 通过反序列化的方式构造多个对象
        // 序列化
        FileOutputStream fos = new FileOutputStream("d:/.xtxt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(("d:/.xtxt")));
        SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
        System.out.println(s3);
    }
}
