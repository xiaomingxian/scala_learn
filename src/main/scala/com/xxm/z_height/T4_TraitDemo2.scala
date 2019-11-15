package com.xxm.z_height

object T4_TraitDemo2 {
  def main(args: Array[String]): Unit = {
    //xxm1::声明时混入 --- 当前类最后初始化
    println("---------------->>声明时混入")
    new FF()
    println("---------------->>构造时混入")
    //xxm2::构造时混入 --- 当前类最先初始化
    new EE with BB with CC

    //xxm3::特质可以继承类  / 如果混入该特质的类，已经继承了另一个类(A类)，则要求A类必须是特质超类的子类，否则就会出现多继承，报错

  }
}

trait AA {
  println("-->AA")
}

trait BB extends AA {
  println("-->BB")
}

trait CC extends BB {
  println("-->CC")
}

trait DD extends BB {
  println("-->DD")
}

class EE {
  println("-->EE")
}

class FF extends EE with CC with DD {
  println("-->FF")
}

class KK extends EE {
  println("-->KK")
}