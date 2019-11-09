package com.xxm.re_base

class T2_ShuXingGaoJi {

  def base: Unit = {


  }


  def main(args: Array[String]): Unit = {

    base
  }
}

//构造函数中的属性不可见  Work(inName: String)
class Work(inName: String) {
  var name: String = inName
}

//属性只读[val不可变] Work2(val inName: String)
class Work2(val inName: String) {
  var name: String = inName
}

class Work3(var inName: String) {
  var name: String = inName
}
