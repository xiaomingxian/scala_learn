package com.xxm.baseOne

object T5_OOP {


  /**
    * 对象的成员变量是private修饰----对味提供了 xxx_$eq(xxx)/xxx()[相当于java的setter与getter方法]
    *
    * Scala中类与对象的区别与java一致
    *
    * Scala中类的修饰符默认是 public 但是写上反而会报错
    *
    * 一个Scala源文件可以包含多个public类
    */

  def diguiUnicode(str: String): Long = {
    if (str.length == 1) return str.charAt(0).toLong
    else return str.charAt(0).toLong * diguiUnicode(str.drop(1))
  }


  def other: Unit = {
    println((0 to 10).reverse.foreach(print)) //reverse 返回的是一个Range是一个集合类型 foreach是一个高阶函数[类似与java的lambda用法]
    val n = 10
    //for (i <- 1 to n reverse) {
    //  println( i)
    //}

    "Hello".foreach(show)
    //计算除所有Unicode元素的乘积
    var res = 1L
    "Hello".foreach(res *= _.toLong) //以上形式的简写  _代表遍历出的每个元素
    println("\n" + res)
    // 递归 计算字符串中 字符的Unicode乘积
    val x = diguiUnicode("Hello")
    println(x)
    //println("hello".drop(1))//去除h
    //println("hello".take(1))//获取1

  }

  def show(i: Char): Unit = {
    print(i + "\t")
  }


  def main(args: Array[String]): Unit = {
    //val修饰 对象 对象地址不可变化 但是属性可以变化
    val cat = new Cat

    //多态写法  必须写类型
    var cat2: Any = new Cat

    //相当于setter方法   cat.age_$eq(10) 内部于java一样
    cat.age = 10
    cat.age = 11
    //cat=new Cat
    //相当于getter方法   cat.age()
    println(cat.age, cat.name)


    //  3 other
    other


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
