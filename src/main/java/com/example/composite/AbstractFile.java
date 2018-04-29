package com.example.composite;

import java.util.ArrayList;
import java.util.List;

// 抽象构建
public interface AbstractFile {
    void killVirus();// 杀毒
}

// 查杀图片文件(叶子组件）
class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀图片文件：" + name);
    }
}

// 查杀文本文件(叶子组件）
class TestFile implements AbstractFile {
    private String name;

    public TestFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文本文件：" + name);
    }
}

// 文件夹（容器组件）
class Foler implements AbstractFile {
    private String name;
    // 文件夹有子文件
    private List<AbstractFile> list = new ArrayList<>();

    public Foler(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("---开始杀毒:" + name);
        // 有个天然的递归，如果有子文件夹会递归
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}
