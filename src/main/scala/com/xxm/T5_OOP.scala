package com.xxm

object T5_OOP {

  /**
    * 对象的成员变量是private修饰----对味提供了 xxx_$eq(xxx)/xxx()[相当于java的setter与getter方法]
    *
    * Scala中类与对象的区别与java一致
    *
    * Scala中类的修饰符默认是 public 但是写上反而会报错
    *
    * 一个Scala源文件可以包含多个public类
    *
    *
    */


  def main(args: Array[String]): Unit = {
    val cat = new Cat

    //相当于setter方法   cat.age_$eq(10) 内部于java一样
    cat.age = 10
    //相当于getter方法   cat.age()
    println(cat.age, cat.name)


  }

}


class Cat {


  var name = "Tom"
  var age: Int = _ //_为默认值
  var color: String = _ //
  var name1 = null
  //类型为Null
  var name2: String = null //类型为String

}