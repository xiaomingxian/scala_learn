package com.xxm.z_height

object T4_TraitDemo2 {
  def main(args: Array[String]): Unit = {
    //
    new FF()
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