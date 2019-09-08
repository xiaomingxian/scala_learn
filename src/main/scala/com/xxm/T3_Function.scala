package com.xxm

/**
  * 函数式编程
  */
object T3_Function {
  /**
    * 函数使用细节和注意事项：
    * 1 函数的形参可以是多个，如果没有参数，调用时可以不带()
    * 2 形参列表和返回值列表的数据类型可以是值类型和引用类型
    * 3 Scala中的函数可以根据函数体最后一行代码自行推断返回值类型，可以省略return
    * 4 也可以省略返回值类型
    * 5 如果有return关键字，就不能使用自动推断,返回值类型得明确写出 ：类型=
    * 6 (){} 等价于 ():Unit={} 返回()return无效
    * 7 如果函数无返回值或不确定返回值类型，那么返回值类型可以省略(或者声明为Any) #eg:def a()={} / def a():Any={}
    * 8 Scala语法中任何的语法结构都可以嵌套其他的语法结构，即：函数中可以再声明函数(与外部函数同级不过是加了private修饰，查看编译后文件可知)，[函数中还可以嵌套同名函数，同名函数的区分eg:a&1,a$2...]
    * 类中可以再声明类，方法中可以再声明方法
    * 9 Scala函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实参，会使用默认值，如果有实参则会覆盖；覆盖指定的可以指明参数名称
    * 10 函数的形参默认是val不允许修改
    */


  /**
    * 概念：
    * 过程函数：函数的返回值为Unit # 如果函数没有明确的返回值，等号可以省略  #有自动类型推断的不属于此范畴
    */

  def haveDefault(name: String = "mac"): Unit = {
    //name="----"//val 修改报错
  }

  /**
    * 输出为()   因为()中间无内容表示没有返回值 有return也无效{}  等价于 ():Unit={}
    */
  def noReturn() {
    def noReturn() {}

    return 10
  }
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

  def sum2(n: Int, args: Int*): Int = {


    println("--->参数个数：" + args.length + 1)

    var sum = n
    for (i <- args) {
      sum += i
    }
    sum
  }

  def kebian: Unit = {
    //  1 求和
    val sum = sum2(1, 2, 3, 4, 5, 6)
    println("====>可变参数求和：" + sum)
    //  2 var x ="ssss"  等价于 def x()={"ssss"}


  }

  def dx_test: Int = {
    println("-----------函数执行。。。。。。")
    1
  }

  def duoxing: Unit = {
    //通过关键字---不能修饰var 是线程安全的
    //lazy var x = dx_test
    lazy val x = dx_test
    //真正使用函数
    println("----真正使用函数：" + x)
    //  lazy 也可以修饰 lazy val x = 1  使用 x #通过终端测试
  }

  def main(args: Array[String]): Unit = {
    //1.base
    base
    //  2 可变参数
    kebian
    //  3 惰性函数
    duoxing

  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2 //可以省略return
  }


}
