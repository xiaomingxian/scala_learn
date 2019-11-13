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
    println("==================子类构造器向父类构造器传值===================")
    var son3: Son3 = new Son3("Tom")
    son3.showInfo()
    //  访问属性 使用的是方法所以不会根据引用的变化而变化
    var f: Father3 = new Son3("Tom")
    println("================ 属性重写 =====================")
    println("父类引用访问属性：", f.address)
    println("子类引用访问属性", son3.address)
    println("================ val重写def(不带参数) =====================")
    //调用还是使用的方法 得到的都是子类的属性值
    println("父类：", f.age, "\t 子类：", son3.age)

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
  println("=======父类主构造器")
}

class Son2 extends Father2 {
  println("---------子类主构造器")
  //辅助构造器私有
  //private
  def this(name: String) {
    this
    println("-----子类辅助构造器")
  }

}

//子类构造方法向父类构造方法传值  super什么的不管用(没有这种写法)
class Father3(name: String) {
  val pName: String = name

  val address: String = "mmmm"

  def age(): Int = {
    0
  }

}
//父类构造器参数使用的是子类主构造器的参数 ：class Son3(name: String) extends Father3(name)
class Son3(name: String) extends Father3(name) {
  //scala重写属性需要 override修饰
  override val pName: String = name
  override val address: String = "BeiJing"

  override val age: Int = 10

  def showInfo(): Unit = {
    println("获取父类属性：", pName)
  }
}