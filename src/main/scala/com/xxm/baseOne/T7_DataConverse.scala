package com.xxm.baseOne

/**
  * 类型转换
  */
object T7_DataConverse {
  def main(args: Array[String]): Unit = {
    var v1=10
    var v2=10.9
    //var v3:Int=v1+v2//编译出错，为double类型
    var v4:Int=(v1+v2).toInt//手动转换

    //byte,short,char三者运算首先会转换为int





  }
}
