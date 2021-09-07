package com.knoldus.implementTest

import com.knoldus.ques2.implementaion.FunctionsImpl
import org.mockito.Mockito.{mock, when}
import org.scalatest.flatspec.AsyncFlatSpec

class FunctionsUnitTest extends AsyncFlatSpec{

  val function = new FunctionsImpl()

  // Unit Test Cases for Fibonacci.
  "Fibonacci series " should "return [0,1,1] " in {
    val result = function.fibonacci( 0, 1,  3)
    assert(result sameElements Array[Int](xs = 0, 1, 1))
  }

  "Fibonacci series " should "return [4,5,9,14,23] " in {
    val result = function.fibonacci(4, 5, 5)
    assert(result sameElements Array[Int](xs = 4,5,9,14,23))

  }

  "Fibonacci series " should "not return [0,1,1,2,2] " in {
    val result = function.fibonacci( 0,  1,  5)
    assert(result != Array[Int](xs = 0,1,1,2,2))
  }


  // Unit Test Cases for Division
  "On Dividing 200 by 25" should "give 8" in {
    val result = function.divide(200, 25)
    assert(result==8)
  }
  "Dividing any number by 0" should "give false" in {
    val result = function.divide(200, 0)
    assert(result == 0)
  }
  "On Dividing 200 by 25" should "not give 10" in {
    val result = function.divide(200,25)
    assert(result!=10)
  }

}