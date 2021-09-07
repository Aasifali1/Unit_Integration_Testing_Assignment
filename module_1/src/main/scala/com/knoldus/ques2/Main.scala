package com.knoldus.ques2

import com.knoldus.ques2.implementaion.FunctionsImpl

object Main {
  def main(args:Array[String]): Unit ={
    val functionsImpl = new FunctionsImpl()
    val result = functionsImpl.fibonacci(0,1,3)

    functionsImpl.divide(12,0)
    println(println(result.mkString(" "))
    )

  }
}
