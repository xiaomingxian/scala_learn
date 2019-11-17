package com.xxm.z_height

object T7_Implicit {
  def main(args: Array[String]): Unit = {

    //原始转换
    //val n: Int = 3.333toInt

    //1 隐式转换 要求implicit 接收一个参数
    implicit def converse(d: Double): Int = {
      //底层生成： converse$1
      d.toInt
    }

    implicit def ff(d: Float): Int = {
      d.toInt
    }
    //3 底层原理：方法底层[底层生成： converse$1] ; 隐式转换时[编译器编译：converse$1(3.333)]

    //3 注意事项:可以定义多个但是只能有一个被匹配(主要看参数类型与返回类型)
    //implicit def f2(d: Double): Int = {
    //    //底层生成： converse$1
    //    d.toInt
    //  }

    val num: Int = 3.333 //编译器编译：converse$1(3.333)
    val num2: Int = 3.333f //自动匹配到对应类型
    println(num)


  }
}
