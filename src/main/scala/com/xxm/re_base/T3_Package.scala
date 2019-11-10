//方式2：二级package
package com.xxm.re_base
package two

object T3_Package {
  def main(args: Array[String]): Unit = {
    println("xxxx")
  }
}


//方式3：{}格式嵌套
package com.xxm.package_test {

  //在包中直接写方法会报错
  //def a(){}

  object AAA {
    def main(args: Array[String]): Unit = {
      //导入可以从相对目录开始
      import packTwo.BB
      println("====>>父包访问子包元素：" + new BB().name) //初始化
      //包名冲突事用绝对路径
      println("====>>父包访问子包元素：" + new com.xxm.package_test.packTwo.AA("tom").name) //初始化
    }
  }

  class AA {
    var name: String = "father package Tom"
  }

  package packTwo {

    object AAA {
      def main(args: Array[String]): Unit = {
        println("访问父包元素", new com.xxm.package_test.AA().name)
        println("访问本包元素", new AA("本包").name)
      }
    }

    class AA(val nameC: String) {
      var name: String = nameC
    }

    class BB {
      var name: String = "相对路径"
    }

  }

}


/**
  * 包对象与包得在同级目录下
  * packageObj对象与packageObj都在com.xxm下
  */
package com.xxm {

  package object packageObj {
    var name: String = "包对象属性"

    def f1(): Unit = {
      println("。。。。。。包对象demo")
    }


  }

}


package com.xxm.packageObj {

  object ABC {
    def main(args: Array[String]): Unit = {
      println("xxx", name, f1())
    }
  }


}