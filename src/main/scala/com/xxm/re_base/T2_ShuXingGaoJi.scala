package com.xxm.re_base

import scala.beans.BeanProperty

object T2_ShuXingGaoJi {

  def base: Unit = {
    var work = new Work("构造方法属性不可见")
    work.getSex
    work.setSex(1)
    work.sex
    work.sex = 2
    new Work2("构造方法属性只读").inName //=""
    new Work3("构造方法属性可赋值").inName = "可变化"



  }


  def main(args: Array[String]): Unit = {

    base
  }
}

//构造函数中的属性不可见  Work(inName: String)
class Work(inName: String) {

  //会生成get/set方法 原来的属性get/set也可用
  @BeanProperty var sex: Int = _
  var name: String = inName
}

//属性只读[val不可变] Work2(val inName: String)
class Work2(val inName: String) {
  var name: String = inName
}

class Work3(var inName: String) {
  var name: String = inName
}
