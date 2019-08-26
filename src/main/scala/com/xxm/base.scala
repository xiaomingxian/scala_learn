package com.xxm

object base {

  def main(args: Array[String]): Unit = {
    //var是保留关键字
    val age: Int = 1
    val num: Int = 2
    printf(s"num1:%d,num2:$num,num3:${num + num}", age)

    val arr = new Array[Int](10)
    for (a <- arr) {
      println(a)
    }

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
