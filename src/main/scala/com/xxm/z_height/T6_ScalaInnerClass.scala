package com.xxm.z_height

object T6_ScalaInnerClass {
  def main(args: Array[String]): Unit = {

    //1 静态内部类创建
    val inner1 = new OuterClassT6.StaticInnerClass()

    //2 局部内部类创建----new 外部实例.内部类()   #外部实例得是val接收
    val outerClass: OuterClassT6 = new OuterClassT6()
    val outerClass2: OuterClassT6 = new OuterClassT6()
    val innerClass1 = new outerClass.InnerClass()
    val innerClass2 = new outerClass2.InnerClass()

    //3 内部类访问外部类属性
    innerClass1.info()


    //4 内部类假如接收类型是内部类 (区分外部实例)   #java可以随意，因为内部类与外部类的类绑定  scala是与实例绑定
    //innerClass1.receiveInnerClass(innerClass2)
    innerClass1.receiveInnerClass(innerClass1)


    //5 类型投影(不区分外部实例)  外部类#内部类
    innerClass1.receiveInnerClassTouYing(innerClass1)
    innerClass1.receiveInnerClassTouYing(innerClass2)


  }

}

class OuterClassT6 {

  outer =>

  class InnerClass {
    println("=====>成员内部类创建")

    /**
      * 内部类访问外部类属性
      * 外部类.this.属性
      * 外部类.this 可以认为是外部类的一个实例
      */
    def info(): Unit = {
      println(OuterClassT6.this.name)
      println("====>>别名访问方式：：", outer.name)
    }

    def receiveInnerClass(innerClass: InnerClass) {}

    //类型投影  外部类#内部类
    def receiveInnerClassTouYing(innerClass: OuterClassT6#InnerClass): Unit = {
      println("===>>>>>使用了类型投影")
    }

  }


  var name: String = "tom"


}

object OuterClassT6 {

  class StaticInnerClass {
    println("----->>>静态内部类创建")
  }

}