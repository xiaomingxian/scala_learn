package com.xxm

object T1_Base {



  def main(args: Array[String]): Unit = {
    //base
    base

    //数据类型--一切皆对象
    dataType

    //作业
    homework

    //类型转换[隐式(自动)[高精度接收低精度]/强制]
    //    多种类型运算时，系统会将所有数据转换成容量最大的类型
    //    低精度接收高精度会编译报错
    //    Byte/Short/Char之间不会转换，会编译报错  #3者计算会转换为Int
    //强制类型转换 (可能会有精度损失)   #eg:3.5.toInt
    zhuanhaun


    //  首字符为操作符后续也得跟操作符至少一个[编译时会做处理eg:++==>$plus$plus]
    caozuofu


    //  运算符
    //%  a%b=a-a/b*b  #取余的公式化描述
    //  没有++/-- 取而代之 +=n / -=n
    yunsuan


  }

  def yunsuan: Unit = {
    //算数运算 略
    //  还有97天放假求 星期数与天数
    var xq = 97 / 7
    var day = 97 % 7
    printf("星期%d,天数%d \n", xq, day)


    println(1 << 2)
    //  逻辑运算 && ||  ！
    //  赋值运算
    var c = 1
    c <<= 2 //c=c<<2
    println("左移乘" + c)
    c >>= 2
    println("右移除" + c)
    c &= 1 //按位与
    c ^= 1 //按位抑或后赋值
    c != 1 //按位或后赋值


    //  scala支持代码块返回值
    var v1 = {
      if (true) "ok" else "no"
    }
    println(v1)

    //面试题 交换两个变量的值 不允许使用中间变量
    var a = 10
    var b = 2
    a = a + b
    b = a - b
    a = a - b
    printf(s"a:${a},b:$b\n")

    //2次位运算后值不变
    a = a ^ b
    b = a ^ b
    a = a ^ b
    printf(s"a:${a},b:$b\n")

    //单位运算：& | ^ ~ >> << >>>无符号右移
  }


  def caozuofu: Unit = {
    val ++ = "kkk"
    var -- = 1
    var -+*/ = 4
    //var -a = 1//编译报错
    //关键字做变量名 得加反引号
    var `true` = 1


    //  错误的格式
    //  1abc   # 数字开头
    //  h-b    # 操作符在中间
    //  a b    #中间出现空格不连续
    //var Int:Int=1//正确 Int不是预留字，是预定义字符
    var Int = 1.1
    var float: Float = 2.2F //同上
    //var _=1//错误 编译不报错，运行会报错   _有各种各样的意义


    //  关键字 39个

  }


  def zhuanhaun: Unit = {

    //    编译测试
    var s: Short = 5
    //    s=s-1 //会转换成int进行运算

    var b: Byte = 3
    //b=b+4//运算会转成Int
    b = (b + 4).toByte //强制转换


    var c: Char = 'a'
    var i: Int = 9
    var d: Float = .23F
    var dou: Double = c * i + d //隐式转换


    var bb: Byte = 5
    var ss: Short = 3
    //var t:Short=bb+ss//运算转Int
    var t2 = s + b //自动类型推导

    //Exception in thread "main" java.lang.NumberFormatException: For input string: "12.8"
    //println("------------->" + "12.8".toInt)




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


  def base = {
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
  }

}

class Dog {
  var name: String = ""
  var age: Int = _ //默认值0
}
