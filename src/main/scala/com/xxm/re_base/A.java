package com.xxm.re_base;


/**
 * java子类构造方法默认调用父类 super()[如果不显示调用指定构造方法的话]
 */
public class A {
    public A() {
        System.out.println("A()");
    }

    public A(String name) {
        System.out.println("A(name)");
    }

    public static void main(String[] args) {
        new B("aa");
    }
}

class B extends A {
    public B() {
        System.out.println("B()");
    }

    public B(String name) {
        System.out.println("B(name)");
    }
}