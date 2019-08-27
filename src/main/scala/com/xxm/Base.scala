package com.xxm

object Base {

  def main(args: Array[String]): Unit = {
    //var声明变量  val声明常量
    val age: Int = 1
    val num: Int = 2
    var age1 = 10
    age1 = 30
    printf(s"num1:%d,num2:$num,num3:${num + num}", age)

    val arr = new Array[Int](10)
    for (a <- arr) {
      println(a)
    }
    //    类型判断
    println(num.isInstanceOf[Int])
    //    类型确定后就不能改变[也叫强类型语言]

    //数据类型--一切皆对象
    dataType



  }

  def dataType(): Unit = {
    var num: Int = 10
    println(num.toDouble,100.toDouble)

  }

  /**
    *生成文档 scaladoc -d /xxx/xxx 文件.scala
    *
    * @param n1
    * @param n2
    * @return
    */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}

class Dog {
  var name: String = ""
  var age: Int = _ //默认值0
}
