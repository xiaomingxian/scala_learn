package com.xxm.z_height

object T8_ImplicitDemo {

  //后者放在这里//或者专门写一个文件 import
  //addDelete 底层生成的函数名
  //implicit def addDelete(mysql: Mysql): DB = {
  //  new DB
  //}

  def main(args: Array[String]): Unit = {

    implicit def addDelete(mysql: Mysql): DB = {
      new DB
    }

    val mysql: Mysql = new Mysql()
    mysql.delete//addDelete$1(mysql).delete()
  }
}

class Mysql {


  def insert(): Unit = {

  }

}

class DB {
  def delete: Unit = {
    println("---->>>>delete")
  }
}