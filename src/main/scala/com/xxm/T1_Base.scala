package com.xxm

object T1_Base {


  def main(args: Array[String]): Unit = {
    //var声明变量  val声明常量
    val age: Int = 1
    val num: Int = 2
    var age1 = 10
    age1 = 30
    //    字符串输出的3种方式   1.""+""  2.printf("%x...",x,y,z)  3.引用 $xxx/${xxx}
    printf(s"num1:%d,num2:$num,num3:${num + num}", age)

    val arr = new Array[Int](10)
    for (a <- arr) {
    }

    //    类型判断
    println(num.isInstanceOf[Int])
    //    类型确定后就不能改变[也叫强类型语言]

    //数据类型--一切皆对象
    dataType

    //作业
    homework

    //类型转换[隐式(自动)[高精度接收低精度]/强制]
    //    多种类型运算时，系统会将所有数据转换成容量最大的类型
    //    低精度接收高精度会编译报错
    //    Byte/Short/Char之间不会转换，会编译报错  #3者计算会转换为Int
    zhuanhaun


  }


  def zhuanhaun: Unit = {


  }


  def homework: Unit = {

    // REPL(终端)   计算3的平方根-再对该值求平方
    math.sqrt(3)

    //    1.如何检测val/var:通过重新赋值进行验证
    //    "xxx"*n #返回字符串拼接n次数

    //    2.10 max 2 或者 10.max(2) #返回2个数的最大值  RichInt/Int 里都有此方法
    //    计算2的1024次方   #var x = BigInt(2)   x.pow(1024) /BigInt(2).pow(1024)

    //    3.String的首尾字符串  #首："xxx".take(从1开始)截取从1到n   / "xxx"(从0开始)
    //        #尾 "xsc".reverse.take(1)/"xxx".takeRight(1)  "xyz"("xyz".length-1)


  }


  /**
    * 数值大小不受os影响
    * 最高位是符号位   0正   1负
    * Byte      #8位 -128-127
    * Short     #16位
    * Int       #32位    -2^31~2^31-1
    * Long      #64位
    * Float
    * Double
    * Char
    * String
    * Boolean
    * Unit    #唯一的值() 等同于void
    * Null
    * Nothing   #任何类型的子类型
    * Any       #所有类型的超类
    * AnyRef    #所有引用类型的超类
    *
    */
  def dataType(): Unit = {
    var num: Int = 10
    println(num.toDouble,100.toDouble)


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

class Dog {
  var name: String = ""
  var age: Int = _ //默认值0
}
