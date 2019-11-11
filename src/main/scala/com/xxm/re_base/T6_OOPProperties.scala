package com.xxm.re_base

/**
  * 封装/继承/多态
  */
object T6_OOPProperties {

  def main(args: Array[String]): Unit = {
    //1 继承——属性测试
    var son: Son = new Son()
    //get方法：public String name(){...}
    //set方法：public String name_$eq(String ...){...}
    son.name //所有属性都拿到了(包括私有属性，但是不能访问(反编译private修饰的属性，方法也为private))(f)表示是方法

    //2 继承-方法重写
    son.f1()

  }
}

class Base {
  var name: String = "tom"
  protected var age: Int = 20
  private var address: String = "BeiJing"

  def f1(): Unit = {
    println("--->>>父类信息")
  }
}

class Son extends Base {
  def main(args: Array[String]): Unit = {
    age //protected只能在子类访问  虽然编译后是public 但是不能访问(编译器在编译前控制，不允许访问)
  }

  override def f1(): Unit = {
    println("====>>>>子类信息")
    super.f1()
  }
}