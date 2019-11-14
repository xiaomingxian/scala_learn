package com.xxm.re_base

object T10_Apply {
  def main(args: Array[String]): Unit = {
    var pig = Pig()
    println(pig.realName)
    var pig2 = Pig("佩琦")
    println(pig2.realName)
  }
}

class Pig(name: String) {
  var realName: String = name
}

object Pig {
  //相当于构造方法
  def apply(name: String): Pig = new Pig(name)

  def apply(): Pig = new Pig("匿名属性值")
}
