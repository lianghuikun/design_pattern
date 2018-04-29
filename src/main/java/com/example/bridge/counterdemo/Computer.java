package com.example.bridge.counterdemo;

// 电脑接口
public interface Computer {
    void sale();
}

// 台式电脑
class Desktop implements Computer {
    public void sale() {
        System.out.println("销售台式机");
    }
}

// 笔记本
class Laptop implements Computer {
    public void sale() {
        System.out.println("销售笔记本");
    }
}

// 平板电脑
class Pad implements Computer {
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

// 联想台式笔记本
class LenvovoDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("联想台式机");
    }
}

class LenvovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("联想笔记本");
    }
}

// 还有神舟、戴尔等品牌，就不写了。
// 每个品牌都要写大量地子类，容易造成类膨胀,扩展性很不好。


