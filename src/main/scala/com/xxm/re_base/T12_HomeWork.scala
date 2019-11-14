package com.xxm.re_base

/**
  * 使用App反转输出
  */
object T12_HomeWork extends App {
  var a = args.reverse
  println(a.mkString(" "))


}


object testHomeWork{
  def main(args: Array[String]): Unit = {
    println(Suits)
    println("是否是红色：",Suits.isRed(Suits.fp))
  }
}

class Point(num1: Int, num2: Int) {
  var num_one: Int = num1
  var num_two: Int = num2
  println(num_two, num_one)
}

object Point {
  def apply(num1: Int, num2: Int): Point = new Point(num1, num2)
}


object Suits extends Enumeration {
  type Suits = Value
  //type取别名
  val ht = Value("HT")
  val fp = Value("FP")
  val hx = Value("HX")
  val mh = Value("MH")

  override def toString(): String = {
    Suits.values.mkString(",")
  }

  def isRed(suits: Suits): Boolean = {
    if (suits == ht || suits == fp) true else false
  }
}


