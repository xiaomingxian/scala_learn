package com.xxm

/**
  * 函数式编程
  */
object T3_Function {

  def base: Unit = {
    //1.方法转函数
    println("-->" + sum _) //-->com.xxm.T3_Function$$$Lambda$3/575335780@c39f790
    //调用
    //var x = sum _ (1, 2)//连写报错
    var x = sum _
    x(1, 2)


    // 2.函数定义   如果没有return最后一行表示返回值

    val f = (n1: Int, n2: Int) => {
      n1 + n2
    }
    println("====>函数定义：" + f(1, 2))

    def f2() = {
      1 + 2
    }

    //={...}表示自动推导类型
    def f3() {} //什么都不写表示无返回值 Unit


    //3.递归
    def f4(n: Int): Int = {
      if (n == 1) {
        3
      } else {
        return 2 * f4(n - 1) + 1
      }
    }

    println("====>递归求值：" + f4(3))

    //斐波那契
    def fbnq(n: Int): Int = {
      if (n == 1) {
        1
      }
      else if (n == 2) {
        1
      } else {
        fbnq(n - 1) + fbnq(n - 2)
      }
    }

    println("===>斐波那契："+fbnq(7))


  }

  def main(args: Array[String]): Unit = {
    //1.base
    base

  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2 //可以省略return
  }


}
