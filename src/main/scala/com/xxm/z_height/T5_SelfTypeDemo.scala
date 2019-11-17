package com.xxm.z_height

/**
  *
  * https://blog.csdn.net/bluishglc/article/details/60739183#%E5%BC%95%E5%85%A5%E8%87%AA%E8%BA%AB%E7%B1%BB%E5%9E%8Bself-type
  * 一个特质的“自身类型”是这个特质要求的“this”指针（引用）的“实际”类型，
  */
object T5_SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}

trait Logger {
  /**
    * 告诉编译器：this就是Exception (下面才可以调用Exception的方法)
    */
  this: Exception =>
  def log() {
    println(getMessage)//getMessage是Exception中的方法
  }
  def log2={
    println(getCause)
  }
}
class EEE extends  Exception
class E1 extends Exception with Logger {}//想要混入自身类型特质：类必须得继承自身特质中所指的类(间接继承也会编译报错[下一行写法])
//class E1 extends EEE with Logger {}//
//class E2 extends Logger{}//编译报错：：