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

  def for_demo: Unit = {
    for (i <- 1 to 3) {
      //前后闭合
      println("---->context:", i)
    }

    for (i <- 1 until 3) {
      println("---<前闭后开>---", i)
    }

    println("---------------多层for循环-----------")
    var ii = 0
    for (i <- 1 to 3; j <- 5 to 10; k <- 1 to 4) {
      //i*j
      //println("--->i:" + i)
      //println("--->j:" + j)
      ii += 1
    }
    println("~~~~~~次数：" + ii)
    println("-=-==" * 7)
    var list = List(1, 2, "v1", "v2")
    for (l <- list) println(l)
    println("-=-~~" * 7)
    //  yield 接收保存生成方式
    var a = 0
    var yield_val = for {
      a
        <- List(1, 2, 3, 4, 5, 6, 7)
      if a < 6;if a > 2
    } yield a

    for (aa <- yield_val) println("========>:" + aa)
  }

  def main(args: Array[String]): Unit = {
    //1.demo
    trait_demo
    //2.console-demo
    //console_demo
    //3.for循环
    for_demo
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
