package com.knoldus.ques2.implementaion

import com.knoldus.ques2.functionTrait.FunctionsTrait

class FunctionsImpl extends FunctionsTrait{

  override def divide(num1: Int, num2: Int): Int = {
    if(num2 == 0 ){
      println(num2)
      0
    }
    else {
      val result = num1/num2;
      result;
    }

  }

  override def fibonacci(firstTerm: Int, secondTerm: Int, totalnoTerms: Int): Array[Int] = {
    val fibonacciSeries: Array[Int] = new Array[Int](totalnoTerms)
    var a = firstTerm
    var b = secondTerm
    fibonacciSeries(0) = firstTerm
    fibonacciSeries(1) = secondTerm
    for (i <- 2 until totalnoTerms) {
      val next_term = a + b
      fibonacciSeries(i) = next_term
      a = b
      b = next_term
    }
    fibonacciSeries
  }


}
