package com.xxm.z_height

object T2_MInx2 {
  def main(args: Array[String]): Unit = {
    //1 先找TS3_1发现上层还有TS2再发现上层还有TS1再发现上层还有TP 到顶了
    //2 顺序向下执行构造方法 依次打印语句
    //3 TS3_2 向上发现TS2 已经创建过了就不再向上 然后只执行它
    var x = new Normal with TS3_1 with TS3_2
    println("***" * 10)
    //执行方法(包含super调用)：1 从右向左;2 找左边特质;3 左边没有了就去找父类
    //顺讯底层是栈实现(创建对象时找到最顶层，从最顶层开始压入栈，执行方法时再弹栈)
    x.f()
  }
}

trait TP {
  println("最顶层")

  def f(): Unit = {
    println("---->TP")
  }
}

trait TS1 extends TP {
  println("第一层")

  override def f(): Unit = {
    println("---->TS1")
    super.f()
  }

}

trait TS2 extends TS1 {
  println("第二层")
  super.f()

  override def f(): Unit = {
    println("---->TS2")
    super.f()
  }


}

trait TS3_1 extends TS2 {
  println("第三层左")

  override def f(): Unit = {
    println("---->TS3_1")
    super.f()
  }


}

trait TS3_2 extends TS2 {
  println("第三层右")

  override def f(): Unit = {
    println("---->TS3_2")
    //super.f()//按照以上写法--左边有特质会调用左边TS3_1的方法 而不会调用 父类的方法
    super[TS2].f()// new Normal with TS3_1 with TS3_2 //父类执行完毕 继续往左边找
  }


}

class Normal {}