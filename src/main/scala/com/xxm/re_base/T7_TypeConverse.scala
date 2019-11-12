package com.xxm.re_base

import java.util

/**
  * 类型转换
  */
object T7_TypeConverse {
  def main(args: Array[String]): Unit = {
    //1 得到类名：
    println("1 得到类名：", classOf[String])
    //2 使用反射机制
    println("2 反射机制：", "ssss".getClass().getName)
    //3 向下转型 asInstanceOf
    import java.util.List
    var list: List[String]= new util.ArrayList[String]()
    var list2=list.asInstanceOf[util.ArrayList[String]]

    //4 类型判断 isInstanceOf
    println("4 类型判断：", "ss".isInstanceOf[String])

  }
}
