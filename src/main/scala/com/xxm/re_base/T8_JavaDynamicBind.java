package com.xxm.re_base;

/**
 * java动态绑定
 */
public class T8_JavaDynamicBind {


    public static void main(String[] args) {
        AA obj = new BB();
        System.out.println(obj.sum());
        System.out.println(obj.sum1());
        System.out.println("================注释掉子类中的方法===============");
        //注释前 40/30  (调用的都是子类的方法与属性)
        //注释后 30/20  (调用的是父类的方法[但是sum中getI()方法的调用是根据对象的地址调用，调用的子类的属性])
    }
}

class AA {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }


    public int getI() {
        return i;
    }
}

class BB extends AA {
    public int i = 20;

    //public int sum() {
    //    return i + 20;
    //}

    //public int sum1() {
    //    return i + 10;
    //}

    public int getI() {
        return i;
    }

}