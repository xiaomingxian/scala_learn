package com.xxm.z_height;

public class T6_JavaInnerClass {
    public static void main(String[] args) {
        //1 局部内部类的创建方式--当作外部类的属性看待
        new T6_JavaInnerClass().new ChengYuanClass();
        //2 静态内部类
        new T6_JavaInnerClass.StaticClass();
        //3 局部内部类(匿名内部类)


    }


    static {
        System.out.println("静态代码块执行");
    }

    class ChengYuanClass {

    }

    static class StaticClass {



    }

}
