package com.xxm.re_base

class T4_Package2 {
  def main(args: Array[String]): Unit = {
    //1 默认 public 底层编译属性为private 但是提供了类似 get/set方法
    new BBBB().name //
    //2 显示定义为private属性的方法
    //demo：如下两项不可访问
    //new BBBB().f1()
    //new BBBB().name2
    //3 protected 只有子类可以访问 同包不能访问(比java严格)
    //new BBBB().name3
    //4 protected[包名(某一级)] 扩大可见度
    new BBBB().name31

  }


  //伴生类(非静态) ----- 可以直接访问伴生对象中的属性
  class BBBB {
    var name: String = "tom"
    private val name2: String = "jerry"
    protected var name3: String = "protected properties"
    protected[re_base] var name31: String = "protected properties"

    private def f2() {}

    def main(args: Array[String]): Unit = {
      BBBB.age
      BBBB.f1()
      BBBB.address = "上海"
    }
  }

  //半生对象(静态属性/方法) -----访问伴生类中的属性得通过创建对象访问
  object BBBB {
    var age: Int = 20

    private var address: String = "北京"

    def f1(): Unit = {
      var bb = new BBBB()

    }

  }

  class BBBBB extends BBBB {

    def f2(): Unit = {
      name3 //protected修饰的属性
    }
  }

}
