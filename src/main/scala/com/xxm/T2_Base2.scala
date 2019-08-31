package com.xxm

//import scala.io.StdIn
import scala.io._

object T2_Base2 {


  def trait_demo: Unit = {
    Son.sayHi
  }

  def console_demo: Unit = {
    print("读取行：")
    var name=StdIn.readLine()
    print("\ndouble类型")
    var price=StdIn.readDouble()
    //其他格式略
    println(s"\nread context:$name,double:$price")
  }

  def main(args: Array[String]): Unit = {
    //1.demo
    trait_demo
    //2.console-demo
    console_demo
  }
}
//特质：综合了 接口与抽象类
trait Father {
  def sayHi: Unit = {
    println("--->father say hi")
  }
}

object Son extends Father {
  def sayHello {
    println("~~~~~>son say something")

  }
}
