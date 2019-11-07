package com.xxm.re_base

object T1_ReView {

  def forDemo: Unit = {
    //for循环中的 i<-list  i是val(默认)
    //Range是实例 不是方法

    //循环返回值  将遍历后的结果返回到一个新的Vector集合中
    //for(...) for{...代码块，作逻辑处理}
    val yield_val = for {
      a <- List(1, 2, 3)
      if a < 6
    } yield a

    for (aa <- yield_val) println(aa)
    println("--------->until/to<<<-----------------")
    //until前开后闭
    //前后闭合
    for (i <- 1 until 6) printf("%d\t", i)
    println()
    for (i <- 1 to 6) printf("%d\t", i)
    println()

    println("------->>>>>>步长<<<<<<<------------")
    //不可变的集合对象  val Range : scala.collection.immutable.Range.type = { /* compiled code */ }
    //实例话(重载)
    //  def apply(start : scala.Int, end : scala.Int, step : scala.Int) : scala.collection.immutable.Range.Exclusive = { /* compiled code */ }
    //  def apply(start : scala.Int, end : scala.Int) : scala.collection.immutable.Range.Exclusive = { /* compiled code */ }
    for (i <- Range(10, 20, 2)) {
      //起,始,步长
      printf("%d\t", i)
    }
    println("------->>>>>>嵌套循环<<<<<<<------------")
    println()
    //数量 i*j
    for (i <- 1 to 3; j <- 1 to 3) {
      printf("(%d,%d)\t", i, j)
    }
    println()
    println("------>>>>>>>循环守卫<<<<<<<------------")
    for (i <- 1 to 10 if i % 2 == 0) {
      //打印满足条件的数字
      printf("%d\t", i)
    }
  }

  def returnDemo: Unit = {
    //任何表达式都有返回值 最后一行作为返回值
    var a = 3
    val x = if (a > 3) {
      "aaa"
    }
    //} else {
    //  7
    //  //写return xxx就接收不到值?????
    //}

    //得不到想要的结果就返回() Unit 相当于null
    println(x)
  }

  def main(args: Array[String]): Unit = {
    forDemo

    //returnDemo

    //没有三元运算
    //val x = if (1 > 2) 2 else 3
    //println(x)


  }
}
