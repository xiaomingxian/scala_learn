package com.xxm.baseOne

//import scala.io.StdIn
import scala.io._
import scala.util.control.Breaks._
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

    //for(){} 等价于 for{}{}
    //while do /while 略
    for (i <- 1 to 3) {
      //前后闭合
      println("---->context:", i)
    }

    for (i <- 1 until 3) {
      println("---<前闭后开>---", i)
    }

    println("---------------多层for循环（循环嵌套）-----------")
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
    } yield a//将遍历的结果返回到一个新的Vector集合中

    for (aa <- yield_val) println("========>:" + aa)


    println("---" * 5, "循环守卫(保护)")
    //  类似与 continue
    for (i <- 1 to 10 if i % 2 == 0) {
      println("--循环守卫：" + i)
    }
    println("---" * 5, "引入变量")
    for(i<-1 to 10 ;j=i+10){
      println("-->"+j)

    }

    println("------" * 5, "控制步长的两种方式 1-Range对象，2-循环守卫")
    //  method1
    for (i <- Range(1, 10, 2)) {
      println("-----Range对象" + i)
    }

    for (i <- 1 to 10 if i % 2 == 1) {
      println("----循环守卫" + i)
    }



  }

  def while_demo: Unit = {
    // while 略
    // do while 略

  }

  def mul_xunhuan: Unit = {
    //9x9乘法表
    for (i <- 1 to 10) {
      for (j <- 1 to i) {
        print(i + "x" + j + "=" + (i * j) + "\t")
      }
      println()

    }


  }


  def break_demo: Unit = {
    var x = 1
    breakable {
      //捕获异常
      while (true) {
        x += 1
        if (x > 10) {
          //抛出异常
          break()
        }
      }
    }
  }

  def continue_demo: Unit = {
    //  思路 循环守卫
    for (i <- 1 to 10; if i != 3 && i != 5) {
      println("----->循环守卫实现continue:" + i)
    }


  }

  def main(args: Array[String]): Unit = {
    //1.demo
    trait_demo
    //2.console-demo
    //console_demo
    //3.for循环
    for_demo
    //4.while
    while_demo
    //5.多重循环案例
    mul_xunhuan
    //  6.break
    break_demo
    //  7.continue
    continue_demo
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
