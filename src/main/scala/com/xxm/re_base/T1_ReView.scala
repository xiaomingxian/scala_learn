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

  def whileDemo: Unit = {
    var i = 0
    while (i < 10) {
      printf("%s\t", i)
      i += 1
    }
  }

  def functionTest(): Unit = {
    //method and function
    var dog = new Dog
    dog.sum(1, 2)
    //  方法转函数
    var function = dog.sum _
    println("------>>>>>", function)
    //调用与方法一致
    println("函数(方法转)调用：", function(10, 20))
    //创建函数并使用
    val f1 = (n1: Int, n2: Int) => n1 + n2
    println("函数(自定义)调用：", f1(10, 2))
  }


  def typeOfFunction: Unit = {
    //返回值自动推导 ()={}
    def f1() = {
      1 + 2
    }

    //没有返回值
    def f2() {
      1 + 2
    }

    //声明返回值类型 -- 不符合类型会编译报错
    def f3(): Int = {
      1 + 2
    }

  }

  def diGun() = {
    //递归的返回类型得显示声明不能自动推导  会编译报错
    //diGun()
  }


  def lazyFunction: Unit = {
    //不能用var修饰 val固定是线程安全
    lazy val f = l1()
    println("---->函数真正被调用：", f)
  }

  def l1(): Unit = {
    println("-------------- 函数执行 --------------")
  }

  //打印金字塔,终端输入一个数字
  def printjin(s: Int) = {
    for (i <- 1 to s) {
      for (j <- 1 to (s - i)) {
        //数量为行数-第几行
        //遍历打印空格
        print(" ")
      }
      for (k <- 1 to (i + i - 1)) {
        //遍历打印*
        print("*")
      }
      println() //换行
    }
  }

  def myJinZiTa(line: Int): Unit = {
    for (i <- 1 to line) {
      //打印空格
      for (j <- 1 to line - i) {
        print(" ")
      }
      //打印星号
      for (x <- 1 to i + i - 1) {
        print("*")
      }
      //换行
      println()
      //星：1 3 5 7 9  需求(i+i-1)
      //行：1 2 3 4 5   i
      //差：0 1 2 3 4   i-1


    }
  }

  def oop: Unit = {}

  def main(args: Array[String]): Unit = {
    //forDemo

    //returnDemo

    //没有三元运算
    //val x = if (1 > 2) 2 else 3
    //println(x)

    //whileDemo
    //functionTest()

    //函数的几种形式
    //typeOfFunction

    //diGun

    //lazyFunction

    //printjin(10)
    //myJinZiTa(10)


    oop





  }
}


class Dog {

  //方法
  def sum(n1: Int, n2: Int): Int = {
    //n1=10
    n1 + n2
  }

}