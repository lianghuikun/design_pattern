package com.example.prototype;

import java.io.*;
import java.util.Date;

/**
 *
 * 原型模式：
 *  通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式
 *  就是java中的克隆技术
 *  优势：效率高(直接克隆，避免了重新执行构造过程步骤)
 * 原型模式的实现：
 *  Cloneable接口和clone方法
 *  Prototype模式中实现起来最困难的地方就是内存复制操作，所幸
 *  java中提供了clone()方法替我们做了绝大部分的事情
 * 使用场景：
 *  原型模式很少出现，一般是和工厂方法模式一起出现，
 *  通过clone的方法创建一个对象，然后由工厂方法提供给调用者
 *  spring中bean的促昂见实际就两种：
 *      单利模式和原型模式(原型模式是和工厂模式搭配使用)
 *  普通new方式和clone方式对比：
 *      如果需要创建大量对象，并且new比较耗时，则用原型
 *      模拟耗时，用sleep睡眠
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Sheep s1 = new Sheep("少", new Date());

        // 使用序列化和反序列化实现深复制
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();
        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();
        s2.setBirthday(new Date(1111111L));
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }
}
