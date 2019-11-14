package com.xxm.re_base

object T11_TraitDemo {
  def main(args: Array[String]): Unit = {
    new SA1().connection()
    new SB1().connection()

  }

}

trait Connection {
  def connection()
}

class FA {}

class SA1
  extends FA with Connection {
  override def connection(): Unit = {
    println("连接 mysql .....")
  }
}

class SA2 extends FA {}


class FB {}

class SB1 extends FB with Connection {
  override def connection(): Unit = {
    println("连接 oracle ....")
  }
}

class SB2 extends FB {}