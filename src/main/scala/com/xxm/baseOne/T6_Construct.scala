package com.xxm.baseOne

/**
  * 主构造器和辅助构造器
  */
object Construct {
  def main(args: Array[String]): Unit = {
    val a = new A("Tom", 10)
    println(a)
    val aa = new A("tom")
    println(aa)
    println("～～～～～～～～～～～～～～～～～～～～～～")
    //  测试 显示调用父类是为了调用其父类
    val son = new Son2("tom") //构造方法私有后会报错


  }

}

//主构造器
class A(name: String, age: Int) {

  var name2: String = name
  var age2 = age
  this.age2 += 10

  //函数以外的部分都会在构造函数中(主构造器中)
  println("-------before--------" + this.age2)

  override def toString: String = name2 + "  ---   " + age2


  //辅助构造器1---每个辅助构造器都必须以一个对先前已经定义的其他辅助器或者主构造器的调用开始
  //在底层就是java的构造器重载
  def this(name: String) {
    this(name, 22) //以主构造器为基准(直接或间接的调用主构造器)----得显示的构造主构造器是为了调用其父类
    this.name2 = name;
  }

  println("-------after--------")
  //辅助构造器2
  //def this(name: String, age: Int)s {
  //  this(name)
  //  this.age2 = age
  //}

}
//主构造器私有
class Father2 //private()
{
  println("=======父类")
}

class Son2 extends Father2 {
  //辅助构造器私有
  //private
  def this(name: String) {
    this
    println("-----子类")
  }
}