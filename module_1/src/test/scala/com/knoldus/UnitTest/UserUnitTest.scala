package com.knoldus.UnitTest

import com.knoldus.ques3.models.User
import com.knoldus.ques3.validator.UserValidator
import org.scalatest.flatspec.AsyncFlatSpec

class UserUnitTest extends AsyncFlatSpec {

  val userValidator = new UserValidator()

  val user1: User = User("Aasif Ali", "aasif@gmail.com", "Noida", "Knoldus")
  val user2: User = User("Akshit", "akshit@gmail.coom", "Noida", "TCS")
  val user3: User = User("Gulfam", "sony$123sony.com", "Noida", "Accenture")
  val user4: User = User("gulshan", "gulshan145@gmail123.com", "Noida", "TCS")

  // Testing the UserImplementation and User Validation
  "User" should " be valid as user company  exists in Database" in {
    val result = userValidator.isValidUser(user1)
    assert(result)
  }

  // USer Email Validation
  "User email Id " should "be valid " in {
    val result = userValidator.isValidEmail(user1)
    assert(result)
  }

  "User email id" should "not be valid as it contains invalid top lavel domain" in {
    val result = userValidator.isValidEmail(user2)
    assert(!result)
  }

  "Email Id without @" should "be invalid " in {
    val result= userValidator.isValidEmail(user3)
    assert(!result)
  }

  "Email Id with alphanumeric name and domain name" should "be valid " in {
    val result= userValidator.isValidEmail(user4)
    assert(result)
  }
}
