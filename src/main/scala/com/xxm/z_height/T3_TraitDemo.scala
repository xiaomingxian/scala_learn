package com.xxm.z_height

object T3_TraitDemo {
  /**
    * 构造时混入
    */
  def main(args: Array[String]): Unit = {
    //var s = new traitDemo with Son with Son2 //抽象的方法的抽象化重写 即使没有调用也会报错？？？？//认为两个方法冲突了(抽象重写与具体实现？？？)
    var s = new traitDemo with Son2 with Son //方法从右到左 最终会调用具体的实现  正常
    //var s = new traitDemo with Son2//只继承了一个且已经具体实现
    s.insert("222")

    println("==============")
    var p = new traitDemo with Properties {
      override val age: Int = 20
    }
    println(p.age, p.name)
  }
}

/**
  * xxm2::富接口：特质中既有抽象方法又有具体实现的方法
  */
trait Parent {


  def insert(num: String)

  def query(): Unit = {
    println("--->>>query<<<----")
  }
}

trait Son extends Parent {
  /**
    * xxm1::
    * 1 如果我们在子特质中重写/实现一个父类的抽象方法，在方法中通过super调用此方法
    * 2 这时我们的方法不是完全实现，因此需要声明为   abstract override (重写抽象方法，在使用时就必须考虑动态混入的顺序)
    * 3 这时super.inset(num) 的调用就和动态混入顺序有着密切的关系
    */
  abstract override def insert(num: String): Unit = {
    println("-------->>>>>son1")
    super.insert(num)
  }
}

trait Son2 extends Parent {
  //如果已经具体实现就不要加 abstract 否则会报错
  override def insert(num: String): Unit = {
    println("------->>>>>son2")
  }
}

/**
  * * xxm3::特质中的具体字段：特质中可以定义具体字段，如果初始化了就是具体字段，如果不初始化就是抽象字段。
  * 混入该特质的类就具有了该字段(字段不是继承，而是直接假如类成为自己的字段)[查看反编译代码]
  *
  * 抽象字段必须被实现
  */
trait Properties {
  val name: String = "tom"
  val age: Int

}

class traitDemo {}