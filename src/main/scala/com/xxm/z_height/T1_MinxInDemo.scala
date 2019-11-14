package com.xxm.z_height

object T1_MinxInDemo {
  /**
    * 动态混入
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    new ABB with Ttt {
      //with 动态混入
      //(假如没有需要实现的方法,只需{})相当于匿名实现只不过 没有具体方法需要实现
      def ff(): Unit = {
        //实现内部抽象方法
      }
    }.f1()
  }
}

trait Ttt {
  def f1(): Unit = {
    println("额外的方法")
  }
}

class TSS {

}


abstract class ABB {
  def ff()

}