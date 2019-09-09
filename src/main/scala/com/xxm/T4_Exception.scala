package com.xxm

object T4_Exception {
  /**
    * Scala没有编译异常的概念，异常都是在运行时捕获处理
    * Scala把小范围的异常放在后面不会报错，但是不会被执行  //java把小范围的异常放在后面会报错
    * finallyu于java一样
    */


  def base: Unit = {
    try {
      var x = 1 / 0
    }
    catch {
      case exception: ArithmeticException => println("捕获到算数异常")
      case exception: ClassCastException => {}
      case exception: Exception => {}
    } finally {
      println("---<一定会执行的代码>")
    }

  }

  def main(args: Array[String]): Unit = {
    //1 base
    base
    //2 test
    //var ex = test
    //println(ex.toString)
    //  3 注解形式
    annotationTest

  }


  def test: Nothing = {
    throw new Exception("---->自定义异常")
  }

  @throws(classOf[Exception])
  def annotationTest = {
    "abc".toInt
  }


}
