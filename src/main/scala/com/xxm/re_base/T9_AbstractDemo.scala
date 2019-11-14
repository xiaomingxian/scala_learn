package com.xxm.re_base

/**
  * 抽象类更侧重与设计
  * 不能被实例话(匿名方式除外)
  * 抽象类可以有实现体也可以没有实现体(如果没有实现体(属性没有初始化)必须生命为抽象)
  * 抽象方法和属性不能用 private final属性修饰 (与重写相违背)
  */
object T9_AbstractDemo {
  def main(args: Array[String]): Unit = {
    var aa: AABS = new BBBS()
    println("抽象属性实现：",aa.name)
    //匿名方式实例华
    var niming=new AABS {
      override var name: String = "匿名实现方式"
    }.name="赋值操作"


    new ABCD().f1()

  }
}

/**
  * var没有赋值就是抽象属性(会生成对应的get/set抽象方法)类也必须声明为抽象类
  * 没有初始化的属性，没有实现体的方法 都是抽象类的特点 类需要声明为抽象
  */
abstract class AABS {
  var name: String
}

class BBBS extends AABS {
  var name: String = "重写属性 加不加 override 都可以"
}

class ABCD {
  private val name: String = "jack"

  private[this] val age = 10


  def f1(): Unit = {

    println(name, age)
  }
}

object ABCD {}
