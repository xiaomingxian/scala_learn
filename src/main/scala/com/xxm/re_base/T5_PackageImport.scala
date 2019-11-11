package com.xxm.re_base

object T5_PackageImport {
  def main(args: Array[String]): Unit = {
    //1 包重命名
    import java.util.{HashMap => JavaHashMap}
    var map = new JavaHashMap[String, Object]()
    map.put("a", "aaa")
    println(map)
    //2 引入部分包
    //import java.util.{List,ArrayList}
    //3 隐藏某些包 xxx=>__   第一个下划线排除此类，第二个下划线引入其他类
    //import java.util.{List=>__}//
  }


  class User {

    import scala.beans.BeanProperty

    @BeanProperty var name: String = "name"

    def main(args: Array[String]): Unit = {


    }

  }

  class User2 {
    //有作用域
    //@BeanProperty var name: String = "name"

  }

}
